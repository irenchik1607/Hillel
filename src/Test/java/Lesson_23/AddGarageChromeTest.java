package Lesson_23;

import BaseTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddGarageChromeTest extends BasePageTest {

    private AddGarageChrome addGarageChrome;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        addGarageChrome = new AddGarageChrome(driver);
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

        String miles = "50";
        String brandName = "Audi";
        String modalName = "Q7";

        addGarageChrome.selectBrandAndModel(brandName, modalName);
        addGarageChrome.fillMileageAndSendForm(miles);

        StringBuilder sb = new StringBuilder(brandName);
        sb.append(" ").append(modalName);
        String expected = sb.toString();

        Assert.assertEquals(addGarageChrome.findResultInfoBrand(), expected);
    }


    @Test
    public void checkCurrentDateInfoTest() throws InterruptedException {

        String miles = "70";
        String brandName = "BMW";
        String modalName = "X6";

        addGarageChrome.selectBrandAndModel(brandName, modalName);
        addGarageChrome.fillMileageAndSendForm(miles);

        String currentDate = addGarageChrome.getCurrentDate();
        String actualDate = addGarageChrome.onlyDateInfo();
        Assert.assertEquals(currentDate, actualDate);
    }

    //Почати з 10 пункту першого ТК
}