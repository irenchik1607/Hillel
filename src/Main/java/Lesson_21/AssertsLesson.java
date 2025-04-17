package Lesson_21;


import Lesson_20.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AssertsLesson {
//    private WebElement logotype;
//    private WebElement signUpButton;
    private WebDriver driver;


    public AssertsLesson(WebDriver driver) {
        this.driver = driver;
    }

    public void logoIsDisplayed() {

        try {
            WebElement logotype = driver.findElement(By.cssSelector(Selectors.LOGO));
            //boolean displayedLogo = logotype.isDisplayed();
            System.out.println("Логотип знайдено");
            //Assert.assertTrue(displayedLogo, "Logo does not displayed");
        } catch (Exception e) {
            System.out.println("Логотип не відображається");
            Assert.fail("Logo does not displayed");
        }

    }

    public void  checkSignUpButtonColor(){
        String expectedColour = "#0275d8";

            WebElement signUpButton = driver.findElement(By.cssSelector(Selectors.SIGN_UP_BUTTON));
            String color = signUpButton.getCssValue("background-color");
            System.out.println(color);
            String hexColor = rgbaToHex(color);
            Assert.assertEquals(hexColor,expectedColour, "Background color of Sign up button is incorrect");

    }

    public String rgbaToHex(String rgba) {
        rgba = rgba.replace("rgba(", "").replace(")", "");
        String[] parts = rgba.split(",");
        int r = Integer.parseInt(parts[0].trim());
        int g = Integer.parseInt(parts[1].trim());
        int b = Integer.parseInt(parts[2].trim());
        return String.format("#%02x%02x%02x", r, g, b);
    }

}
