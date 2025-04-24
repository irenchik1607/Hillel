package Lesson_23;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddGarageChrome extends BasePage {
    Actions actions = new Actions(driver);
//    private String brandName= "Audi";
//    private String modalName= "Q7";


    public AddGarageChrome(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "button.-guest")
    private WebElement guestLogInButton;

    @FindBy(css = "button.btn-primary")
    private WebElement addCarButton;

    @FindBy(id = "addCarBrand")
    private WebElement selectBrand;

    @FindBy(id = "addCarModel")
    private WebElement selectModel;

    @FindBy(id = "addCarMileage")
    private WebElement inputMileage;

    @FindBy(css = "div.justify-content-end .btn-primary")
    private WebElement addFormButton;

    @FindBy(css = "p.car_name")
    private WebElement carInformationOnScreen;

    @FindBy(css = "p.car_update-mileage")
    private WebElement dateInfoOnScreen;


    public void selectBrandAndModel(String name, String model) throws InterruptedException {

        actions.click(guestLogInButton).build().perform();
        actions.click(addCarButton).build().perform();

        Select brand = new Select(selectBrand);
        brand.selectByVisibleText(name);

        Select carModel = new Select(selectModel);
        carModel.selectByVisibleText(model);
        Thread.sleep(1000);
    }


    public void fillMileageAndSendForm(String value) throws InterruptedException {
        inputMileage.clear();
        inputMileage.sendKeys(value);

        actions.click(addFormButton).build().perform();
        Thread.sleep(1000);
    }


    public String findResultInfoBrand() {
        String actual = carInformationOnScreen.getText();
        return actual;
    }


    // Зідрала з чату метод
    public String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return currentDate.format(formatter);
    }

    public String onlyDateInfo() {
        StringBuilder sb = new StringBuilder(dateInfoOnScreen.getText());
        sb = sb.delete(0, 17);
        String actual = sb.toString();
        return actual;
    }

}
