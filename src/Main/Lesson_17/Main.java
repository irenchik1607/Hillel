package Lesson_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

    WebDriver browser = new ChromeDriver();

   // Runtime.getRuntime().addShutdownHook(new Thread(()->browser.quit()));

    browser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    WebElement guestLogIn = browser.findElement(By.cssSelector("button.-guest"));
        guestLogIn.click();
    }
}
