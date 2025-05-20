package BaseTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePageSelenideTest {
    protected String browser = "chrome";

    @BeforeMethod
    public void setUp() {
        Configuration.pollingInterval = 100;
//        Configuration.remote = "http://localhost:8080/";
        Configuration.browser = browser;
       // Configuration.pageLoadStrategy = "eager"; //шукає завантаження потрібного елементу
        Selenide.open("https://guest:welcome2qauto@qauto.forstudy.space/");
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
