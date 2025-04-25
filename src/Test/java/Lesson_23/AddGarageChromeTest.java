package Lesson_23;

import BaseTest.BasePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddGarageChromeTest extends BasePageTest {

    private AddGarageChrome addGarageChrome;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        addGarageChrome = new AddGarageChrome(driver, "Q7","Audi" , 50);
    }

    @AfterMethod
    public void tearDown() {
        addGarageChrome = null;// щоб попередня сторінка не потрапила в наступний тест (зануляємо)
        super.tearDown();
    }


    @Test
    public void checkCorrectOpenedPage() {
        String title = "Hillel Qauto";
        Assert.assertEquals(driver.getTitle(), title);
    }


    @Test
    public void checkBrandAndModalInfoTest() throws InterruptedException {

        addGarageChrome.selectBrandAndModel();
        addGarageChrome.fillMileageAndSendForm(addGarageChrome.getMilesFromInt());

        StringBuilder sb = new StringBuilder(addGarageChrome.getBrandName());
        sb.append(" ").append(addGarageChrome.getModalName());
        String expected = sb.toString();

        Assert.assertEquals(addGarageChrome.findResultInfoBrand(), expected);
    }


    @Test
    public void checkCurrentDateInfoTest() throws InterruptedException {

        addGarageChrome.selectBrandAndModel();
        addGarageChrome.fillMileageAndSendForm(addGarageChrome.getMilesFromInt());

        String currentDate = addGarageChrome.getCurrentDate();
        String actualDate = addGarageChrome.onlyDateInfo();

        Assert.assertEquals(currentDate, actualDate);
    }

    @Test
    public void checkResultInfoInInput() throws InterruptedException {

        addGarageChrome.selectBrandAndModel();
        addGarageChrome.fillMileageAndSendForm(addGarageChrome.getMilesFromInt());

        Assert.assertEquals(addGarageChrome.checkMilesValue(), addGarageChrome.getMilesFromInt());
    }

    @Test
    public void findCarLogo() throws InterruptedException {
        addGarageChrome.selectBrandAndModel();
        addGarageChrome.fillMileageAndSendForm(addGarageChrome.getMilesFromInt());
        Assert.assertTrue(addGarageChrome.findLogo(), "Car logo is not displayed!");
    }

    @Test
    public void srcInfo() throws InterruptedException {
        String expected = "audi.png";
        addGarageChrome.selectBrandAndModel();
        addGarageChrome.fillMileageAndSendForm(addGarageChrome.getMilesFromInt());
        Assert.assertEquals(addGarageChrome.endingOfImage(), expected);
    }
}