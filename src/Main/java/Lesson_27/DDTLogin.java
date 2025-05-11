package Lesson_27;

import Base.Selectors;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DDTLogin {
    private SelenideElement signInButton = Selenide.$(Selectors.SIGN_IN_BUTTON);
    private SelenideElement emailInput = Selenide.$(By.id(Selectors.EMAIL_INPUT));
    private SelenideElement passwordInput = Selenide.$(By.id(Selectors.PASSWORD_INPUT));
    private SelenideElement logInButton = Selenide.$(Selectors.LOGIN_BUTTON);
    private SelenideElement alertMassage = Selenide.$(Selectors.ALLERT_MASSAGE);
    @Step("Open sign in form")
    public void openSignInForm(){

        signInButton.shouldBe(Condition.exist, Condition.visible, Condition.clickable).click();

    }

    @Step("Enter data in form")
    public void enterDataInForm(String email, String password)  {

        emailInput.shouldBe(Condition.visible, Duration.ofSeconds(5));;
        passwordInput.shouldBe(Condition.visible);

        emailInput.setValue(email);
        passwordInput.setValue(password);
        logInButton.shouldBe(Condition.exist, Condition.visible, Condition.clickable).click();
    }

    @Step("Check alert massage")
    public String checkAlertMassage()  {
        String massage = alertMassage.getText();
        return massage;
    }
}
