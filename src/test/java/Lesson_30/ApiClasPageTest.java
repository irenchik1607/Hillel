package Lesson_30;

import ApiPage.ApiClassPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClasPageTest {
    SoftAssert softAssert = new SoftAssert();
    ApiClassPage apiClassPage;


    @BeforeMethod
    public void setUp(){
        apiClassPage = new ApiClassPage();
    }


    @Test
    public void getBodyAndStatusCodTest() throws URISyntaxException, IOException, InterruptedException {


        String expectedBody = "{\"status\":\"ok\"}";
        int expectedStatusCode = 200;

        softAssert.assertEquals(apiClassPage.getStatusCode(), expectedStatusCode);
        softAssert.assertEquals(apiClassPage.getBody(), expectedBody);
        softAssert.assertAll();

    }

    @Test
    public void getBodyAndCodTask2Test() throws URISyntaxException, IOException, InterruptedException {


        String expectedBody1 = "\"id\":1";
        String expectedBody2 = "\"title\":\"Audi\"";
        int expectedStatusCode = 200;

        softAssert.assertEquals(apiClassPage.getStatusCodeTask2(), expectedStatusCode);

        softAssert.assertTrue(apiClassPage.getBodyTask2().contains(expectedBody1),
                "Expected part \"" + expectedBody1 + "\" not found in actual text");
        softAssert.assertTrue(apiClassPage.getBodyTask2().contains(expectedBody2),
                "Expected part \"" + expectedBody2 + "\" not found in actual text");
        softAssert.assertAll();

    }
}
