package Lesson_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertsLesson_Test {
    private WebDriver driver;
    private AssertsLesson assertsLesson;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        assertsLesson = new AssertsLesson(driver);
    }

    @Test
    public void findLogoResult() {
        assertsLesson.logoIsDisplayed();
    }

    @Test
    public void checkTheColour() {
        assertsLesson.checkSignUpButtonColor();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
