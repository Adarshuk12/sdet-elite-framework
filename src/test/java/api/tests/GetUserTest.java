package api.tests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {
    @Test
    void getTest(){
       given()
               .when().get("https://httpbin.org/get")
               .then().statusCode(200).body("url", equalTo("https://httpbin.org/get")).log().all();
    }
}
