package Lesson_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lesson19 {
    private WebDriver browser;

    @BeforeMethod
    public void openBrowser() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test
    public void logoExistence() {
        WebElement logo = browser.findElement(By.cssSelector(""));
    }

    @AfterMethod
    public void closeBrowser() {
        browser.quit();
    }


}
