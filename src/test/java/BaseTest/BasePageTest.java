package BaseTest;

import Config.Configuration;
import Config.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.HashMap;

public class BasePageTest {
    //    protected static File DOWNLOADS = new File("C:\\Users\\irenc\\Documents\\Hillel\\src\\Main\\resources\\Downloads");
    protected WebDriver driver;

    @BeforeMethod

    public void setUp() {

        driver = Configuration.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}