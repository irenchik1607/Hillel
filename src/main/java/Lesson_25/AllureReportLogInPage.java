package Lesson_25;

import Base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AllureReportLogInPage extends BasePage {


    @FindBy(css = "button.-guest")
    private WebElement guestLogInButton;


    public AllureReportLogInPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @Step("Login to Garage")
    public void clickLogInButton() {
        actions.click(guestLogInButton).build().perform();
    }

}

