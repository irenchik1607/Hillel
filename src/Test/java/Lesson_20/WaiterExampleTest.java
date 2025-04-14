package Lesson_20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaiterExampleTest {

    private WebDriver driver;
    private WaitersExample waitersExample;


    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); - неявне очікування

        waitersExample = new WaitersExample(driver);
    }

    @Test
    public void title() {
        if (waitersExample.findTitleMethod(driver)) {
            System.out.println("Сторінка має коректний Тайтл");
        } else {
            System.out.println("Сторінка має НЕкоректний Тайтл");
        }
    }


    @Test
    public void clickLogInAndAddCar (){
        waitersExample.jsClick(driver);
        Assert.assertTrue(waitersExample.addCarClickable(driver), "Кнопка \"Add Car\" не клікабельна");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();

    }


}
