package Lesson_22;

import BaseTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramePageTest extends BasePageTest {

    private FramePage framePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        framePage = new FramePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        framePage = null;// щоб попередня сторінка не потрапила в наступний тест (зануляємо)
        super.tearDown();
    }

    @Test
    public void titleFrameTest() {
        String expected = "Hillel IT School | Учись ради мечты! - YouTube";
        FramePage.YouTubeFrame singleFrame = framePage.getFrame();
        String actual = singleFrame.getTitleText();
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "Title doesn’t equals to the expected result");
    }


}