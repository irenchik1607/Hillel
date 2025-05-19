package Lesson_22;

import BaseTest.BasePageTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SocialLinksTest extends BasePageTest {
    private SocialLinks socialLinks;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        socialLinks = new SocialLinks(driver);
    }

    @AfterMethod
    public void tearDown() {
        socialLinks = null;// щоб попередня сторінка не потрапила в наступний тест (зануляємо)
        super.tearDown();
    }

    @Test
    public void checkNumberOfIconsAndTargetBlank() {
        int expected = 5;
        int actual = socialLinks.getNumberOfIcons();
        Assert.assertEquals(actual, expected, "Social network block doesn’t contain 5 items");

        socialLinks.checkNewTabParameter();
    }

    @Test
    public void urlClickOnIconsFromMain() throws InterruptedException {
        socialLinks.checkUrlClickOnIconAndReturnToMaim();
    }

}