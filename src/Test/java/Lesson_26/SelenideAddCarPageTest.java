package Lesson_26;

import BaseTest.BasePageSelenideTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideAddCarPageTest extends BasePageSelenideTest {

    private SelenideLogInPage selenideLogInPage;
    private  SelenideAddCarPage selenideAddCarPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        selenideLogInPage = new SelenideLogInPage();
        selenideAddCarPage = new SelenideAddCarPage("Q7","Audi" , 50);
    }

    @Description("Єдиний тест")
    @Test
    public void generalTest() throws InterruptedException {

        String expectedTitle = "Hillel Qauto";
        String expectedImg = "audi.png";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(selenideLogInPage.getActualTitle(), expectedTitle);

        selenideLogInPage.clickLogInButton();
        selenideAddCarPage.selectBrandAndModel();
        selenideAddCarPage.fillMileageAndSendForm(selenideAddCarPage.getMilesFromInt());
        StringBuilder sb = new StringBuilder(selenideAddCarPage.getBrandName());
        sb.append(" ").append(selenideAddCarPage.getModalName());
        String expected = sb.toString();
        softAssert.assertEquals(selenideAddCarPage.findResultInfoBrand(), expected);

        softAssert.assertEquals(selenideAddCarPage.onlyDateInfo(), selenideAddCarPage.getCurrentDate());

        softAssert.assertEquals(selenideAddCarPage.checkMilesValue(), selenideAddCarPage.getMilesFromInt());

        softAssert.assertTrue(selenideAddCarPage.findLogo(), "Car logo is not displayed!");

        softAssert.assertEquals(selenideAddCarPage.endingOfImage(), expectedImg);

    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }
}
