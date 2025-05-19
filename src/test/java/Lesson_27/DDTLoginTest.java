package Lesson_27;

import BaseTest.BasePageSelenideTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class DDTLoginTest extends BasePageSelenideTest {
    private DDTLogin ddtLogin;

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        this.browser = browser;
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