package Lesson_23;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddGarage extends BasePage {
    Actions actions = new Actions(driver);
    private int miles;
    private String modalName;
    private String brandName;
    private String milesFromInt;

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

    @FindBy(css = "input.update-mileage-form_input")
    private WebElement inputWithValue;

    @FindBy(css = "div.car_logo img.car-logo_img")
    private WebElement logo;

    public AddGarage(WebDriver driver, String modalName, String brandName, int miles) {
        super(driver);
        this.modalName = modalName;
        this.brandName = brandName;
        this.miles = miles;
        this.milesFromInt = String.valueOf(miles);
    }

    public String getMilesFromInt() {
        return milesFromInt;
    }

    public int getMiles() {
        return miles;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModalName() {
        return modalName;
    }

    public void selectBrandAndModel() throws InterruptedException {

        actions.click(guestLogInButton).build().perform();
        actions.click(addCarButton).build().perform();
        Select brand = new Select(selectBrand);
        brand.selectByVisibleText(brandName);
        Select carModel = new Select(selectModel);
        carModel.selectByVisibleText(modalName);
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


    public String checkMilesValue() {
        String actual = inputWithValue.getDomProperty("value");
        return actual;
    }


    public boolean findLogo (){
    return logo.isDisplayed();
    }


    public String endingOfImage(){
        String fullSrc = logo.getDomAttribute("src");
        int sizeSrc = fullSrc.length();
        String subSrc = fullSrc.substring(sizeSrc-8,sizeSrc);
        return subSrc;
    }

}
