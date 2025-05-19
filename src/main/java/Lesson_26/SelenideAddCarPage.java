package Lesson_26;

import Base.Selectors;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideAddCarPage {
    private int miles;
    private String modalName;
    private String brandName;
    private String milesFromInt;
    private SelenideElement addCarButton = Selenide.$(Selectors.ADD_CAR_BUTTON);
    private SelenideElement selectBrand = Selenide.$(By.id(Selectors.ADD_CAR_BRAND));
    private SelenideElement selectModel = Selenide.$(By.id(Selectors.ADD_CAR_MODEL));
    private SelenideElement inputMileage = Selenide.$(By.id(Selectors.ADD_CAR_MILEAGE));
    private SelenideElement addFormButton = Selenide.$(Selectors.ADD_FORM_BUTTON);
    private SelenideElement carInformationOnScreen = Selenide.$(Selectors.CAR_INFORMATION_ON_SCREEN);
    private SelenideElement dateInfoOnScreen = Selenide.$(Selectors.DATE_INFO_ON_SCREEN);
    private SelenideElement inputWithValue = Selenide.$(Selectors.INPUT_WITH_VALUE);
    private SelenideElement logo = Selenide.$(Selectors.LOGO);

    public SelenideAddCarPage(String modalName, String brandName, int miles) {
        this.modalName = modalName;
        this.brandName = brandName;
        this.miles = miles;
        this.milesFromInt = String.valueOf(miles);
    }

    public int getMiles() {
        return miles;
    }


    public String getModalName() {
        return modalName;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getMilesFromInt() {
        return milesFromInt;
    }


    @Step("Choosing a car brand and model in selects")
    public void selectBrandAndModel() throws InterruptedException {

        addCarButton.shouldBe(Condition.exist, Condition.visible, Condition.clickable).click();
        Select brand = new Select(selectBrand);
        brand.selectByVisibleText(brandName);
        Select carModel = new Select(selectModel);
        carModel.selectByVisibleText(modalName);
        Thread.sleep(2000);
    }

    @Step("Filling in the input with \"miles\" and submitting the form")
    public void fillMileageAndSendForm(String value) throws InterruptedException {

        inputMileage.shouldBe(Condition.exist, Condition.visible).setValue(value);
        addFormButton.shouldBe(Condition.exist, Condition.visible, Condition.clickable).click();

        Thread.sleep(1000);
    }

    @Step("Finding for resulting information by brand")
    public String findResultInfoBrand() {
        String actual = carInformationOnScreen.getText();
        return actual;
    }

    // Зідрала з чату метод
    @Step("Getting the current date")
    public String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return currentDate.format(formatter);
    }

    @Step("Finding the displayed date")
    public String onlyDateInfo() {
        StringBuilder sb = new StringBuilder(dateInfoOnScreen.getText());
        sb = sb.delete(0, 17);
        String actual = sb.toString();
        return actual;
    }

    @Step("Finding information on \"miles\"")
    public String checkMilesValue() {
        String actual = inputWithValue.getDomProperty("value");
        return actual;
    }

    @Step("Finding a logo")
    public boolean findLogo() {
        return logo.shouldBe(Condition.visible).exists();
    }

    @Step("Finding the name of an image")
    public String endingOfImage() {
        String fullSrc = logo.getDomAttribute("src");
        int sizeSrc = fullSrc.length();
        String subSrc = fullSrc.substring(sizeSrc - 8, sizeSrc);
        return subSrc;
    }

}
