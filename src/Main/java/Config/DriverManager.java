package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DriverManager {

    public static WebDriver getDriver(String driverName, Map<String, String> options) {
        WebDriver driver = null;
        String downloadDirectory = options.get("download_directory");
        File downloadDir = null;
        if (Objects.nonNull(downloadDirectory)) {
            downloadDir = new File(downloadDirectory);
            if (!downloadDir.exists()) {
                downloadDir.mkdir();
            }
        }

        switch (driverName) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                if (Objects.nonNull(downloadDir)) {
                    HashMap<String, Object> prefs = new HashMap<>();
                    prefs.put("download.default_directory", downloadDir.getAbsolutePath());
                    chromeOptions.setExperimentalOption("prefs", prefs);
                }
                driver = new ChromeDriver(chromeOptions);
                break;




            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Unknown driver name");
        }

        driver.manage().window().maximize();

        String implicitlyWait = options.getOrDefault("implicitlyWait", "5");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicitlyWait)));

        return driver;
    }


}
