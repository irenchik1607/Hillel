package Lesson_27;

import BaseTest.BasePageSelenideTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DDTLoginTest extends BasePageSelenideTest {
    private DDTLogin ddtLogin;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        ddtLogin = new DDTLogin();
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"test@hillel.ua", "1111"},
                {"test@hillel.ua", "1234"}
        };
    }

    @Test(dataProvider = "testData")
    public void loginTest(String email, String password) {
        ddtLogin.openSignInForm();
        ddtLogin.enterDataInForm(email, password);
        String expected = "Wrong email or password";
        Assert.assertEquals(expected,ddtLogin.checkAlertMassage());
    }
}