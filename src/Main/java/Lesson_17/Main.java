package Lesson_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        try {
            // Runtime.getRuntime().addShutdownHook(new Thread(()->browser.quit()));

            browser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            WebElement guestLogIn = browser.findElement(By.cssSelector("button.-guest"));
            guestLogIn.click();


            List<WebElement> groupOfElements = browser.findElements(By.cssSelector("a.sidebar_btn"));
            for (WebElement group : groupOfElements) {
                System.out.println(group.getText());
            }
            Thread.sleep(2000); //відстрочка
        } catch (Exception e) {
            System.out.println("was exception" + e.getMessage());
            ;
        } finally {
            browser.quit();
        }

    }

}
