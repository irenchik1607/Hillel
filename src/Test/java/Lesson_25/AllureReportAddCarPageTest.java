package Lesson_25;

import BaseTest.BasePageTest;
import Lesson_24.DownloadFile;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AllureReportAddCarPageTest extends BasePageTest {

    private DownloadFile downloadFile;
    private  AllureReportLogInPage allureReportLogInPage;
    private  AllureReportAddCarPage allureReportAddCarPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        downloadFile = new DownloadFile(driver);
        allureReportLogInPage = new AllureReportLogInPage(driver);
        allureReportAddCarPage = new AllureReportAddCarPage(driver, "Q7","Audi" , 50);

    }

    @AfterMethod
    public void tearDown() {
        downloadFile = null;// щоб попередня сторінка не потрапила в наступний тест (зануляємо)
        super.tearDown();
    }

    @Test
    @Owner("Iryna Chyrkova")
    @Description("Checking whether the required page is opened correctly")
    @Link(name = "Allure Report lesson", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a0a")
    @Severity(SeverityLevel.NORMAL)
    public void checkCorrectOpenedPage() {
        String title = "Hillel Qauto";
        Assert.assertEquals(driver.getTitle(), title);
    }

    @Test
    @Owner("Iryna Chyrkova")
    @Description("Checking information about the brand and model of the car")
    @Link(name = "Allure Report lesson", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a0a")
    @Severity(SeverityLevel.CRITICAL)
    public void checkBrandAndModalInfoTest() throws InterruptedException {
        allureReportLogInPage.clickLogInButton();

        allureReportAddCarPage.selectBrandAndModel();
        allureReportAddCarPage.fillMileageAndSendForm(allureReportAddCarPage.getMilesFromInt());
        StringBuilder sb = new StringBuilder(allureReportAddCarPage.getBrandName());
        sb.append(" ").append(allureReportAddCarPage.getModalName());
        String expected = sb.toString();

        Assert.assertEquals(allureReportAddCarPage.findResultInfoBrand(), expected);
    }


    @Test
    @Owner("Iryna Chyrkova")
    @Description("Checking current date information")
    @Link(name = "Allure Report lesson", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a0a")
    @Severity(SeverityLevel.CRITICAL)
    public void checkCurrentDateInfoTest() throws InterruptedException {
        allureReportLogInPage.clickLogInButton();

        allureReportAddCarPage.selectBrandAndModel();
        allureReportAddCarPage.fillMileageAndSendForm(allureReportAddCarPage.getMilesFromInt());

        String currentDate = allureReportAddCarPage.getCurrentDate();
        String actualDate = allureReportAddCarPage.onlyDateInfo();

        Assert.assertEquals(currentDate, actualDate);
    }

    @Test
    @Owner("Iryna Chyrkova")
    @Description("Checking information about the value of the input \"miles\"")
    @Link(name = "Allure Report lesson", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a0a")
    @Severity(SeverityLevel.CRITICAL)
    public void checkResultInfoInInput() throws InterruptedException {
        allureReportLogInPage.clickLogInButton();

        allureReportAddCarPage.selectBrandAndModel();
        allureReportAddCarPage.fillMileageAndSendForm(allureReportAddCarPage.getMilesFromInt());

        Assert.assertEquals(allureReportAddCarPage.checkMilesValue(), allureReportAddCarPage.getMilesFromInt());
    }

    @Test
    @Owner("Iryna Chyrkova")
    @Description("Checking the display of the car logo")
    @Link(name = "Allure Report lesson", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a0a")
    @Severity(SeverityLevel.MINOR)
    public void findCarLogo() throws InterruptedException {
        allureReportLogInPage.clickLogInButton();

        allureReportAddCarPage.selectBrandAndModel();
        allureReportAddCarPage.fillMileageAndSendForm(allureReportAddCarPage.getMilesFromInt());

        Assert.assertTrue(allureReportAddCarPage.findLogo(), "Car logo is not displayed!");
    }

    @Test
    @Owner("Iryna Chyrkova")
    @Description("Check the car brand image")
    @Link(name = "Allure Report lesson")
    @Severity(SeverityLevel.MINOR)
    public void srcInfo() throws InterruptedException {
        allureReportLogInPage.clickLogInButton();

        String expected = "audi.png";

        allureReportAddCarPage.selectBrandAndModel();
        allureReportAddCarPage.fillMileageAndSendForm(allureReportAddCarPage.getMilesFromInt());

        Assert.assertEquals(allureReportAddCarPage.endingOfImage(), expected);
    }

}