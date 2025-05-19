package Lesson_26;

import Base.Selectors;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;



public class SelenideLogInPage {
    private SelenideElement logInButton = Selenide.$(Selectors.BUTTON_GUEST);

    @Step("Login to Garage")
    public void clickLogInButton() {
        logInButton.shouldBe(Condition.exist, Condition.visible, Condition.clickable).click();
    }

    @Step("Getting actual title")
    public String getActualTitle() {
        String actualTitle = getWebDriver().getTitle();
        return actualTitle;
    }

}
