package Lesson_31;
import Lesson_30.ApiClassPage;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URISyntaxException;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.allOf;

public class RestApiMethodsTest {

    @BeforeMethod
    public void setUp(){
    RestAssured.baseURI = "https://qauto.forstudy.space/api/";
    }

    @Test
    public void getBodyAndStatusCodTest() throws URISyntaxException, IOException, InterruptedException {
        given()

                .when()
                    .get("cars/brands")

                .then()
                    .statusCode(200)
                    .body("data.find { it.id == 1 }.title", equalTo("Audi"));
    }
}