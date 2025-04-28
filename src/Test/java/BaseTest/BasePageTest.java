package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.HashMap;

public class BasePageTest {

    protected WebDriver driver;

    @BeforeMethod

    public void setUp() {
        String browser = System.getProperty("browser", "chrome");
        String url;

        //Створюємо папку Даунлоадс в ресурсах
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", "C:\\Users\\irenc\\Documents\\Hillel\\src\\Test\\resources\\Downloads");
        chromeOptions.setExperimentalOption("prefs", prefs);

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(chromeOptions);
            url = "https://guest:welcome2qauto@qauto.forstudy.space/";
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            url = "https://qauto.forstudy.space/";
        } else {
            throw new IllegalArgumentException("Browser type not supported: " + browser);
        }
        driver.get(url);
        driver.manage().window().maximize(); // розгорнули сторінку до макс розміру
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}