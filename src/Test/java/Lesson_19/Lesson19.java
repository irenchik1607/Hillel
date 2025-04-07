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
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test
    public void logoExistence() {
        WebElement logo = browser.findElement(By.cssSelector("a.header_logo svg"));
        if (logo.isDisplayed()) {
            System.out.println("Logo displayed");
        } else {
            System.out.println("Logo does not displayed");
        }
        ;
    }

    @Test
    public void signUpButtonColor() {
        WebElement button = browser.findElement(By.cssSelector("button.header_signin"));
        String color = button.getCssValue("background-color");
        System.out.println(color);
        String hexColor = rgbaToHex(color);
        if (hexColor == "#0275d8") {
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
        }
    }

    //спиздила в джіпіті чаті ((((
    public String rgbaToHex(String rgba) {
        rgba = rgba.replace("rgba(", "").replace(")", "");
        String[] parts = rgba.split(",");
        int r = Integer.parseInt(parts[0].trim());
        int g = Integer.parseInt(parts[1].trim());
        int b = Integer.parseInt(parts[2].trim());
        return String.format("#%02x%02x%02x", r, g, b);
    }

    @AfterMethod
    public void closeBrowser() {
        browser.quit();
    }


}
