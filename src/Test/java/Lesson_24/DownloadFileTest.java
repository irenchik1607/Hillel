package Lesson_24;

import BaseTest.BasePageTest;
import Lesson_23.AddGarage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static org.testng.Assert.*;

public class DownloadFileTest extends BasePageTest {

    private DownloadFile downloadFile;


    @BeforeMethod
    public void setUp() {
        super.setUp();
//        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        downloadFile = new DownloadFile(driver);
        String title = "Hillel Qauto";
        Assert.assertEquals(driver.getTitle(), title);

    }

    @AfterMethod
    public void tearDown() {
        downloadFile = null;// щоб попередня сторінка не потрапила в наступний тест (зануляємо)
        super.tearDown();
    }


    @Test
    public void downloadAudiInstructionTest(){

        downloadFile.downloadFrontWindshieldWipers();

    }

    @Test
    public void allCarList()  {
        downloadFile.allCars();
    }





}