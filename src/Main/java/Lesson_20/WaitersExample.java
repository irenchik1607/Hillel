package Lesson_20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Driver;
import java.time.Duration;

public class WaitersExample {


    @FindBy(css = Selectors.GUEST_LOG_IN_BUTTON)
    private WebElement guestLogInButton;

    @FindBy(css = Selectors.ADD_CAR_BUTTON)
    private WebElement addCarButton;


    public WaitersExample(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean findTitleMethod(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//явне очікування

        try {
            boolean expectedTitle = wait.until(ExpectedConditions.titleIs("Hillel Qauto"));
            return expectedTitle;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void jsClick(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", guestLogInButton);
    }

    public boolean addCarClickable(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));//явне очікування
        try {
            wait.until(ExpectedConditions.elementToBeClickable(addCarButton));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
