package api.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseUriTest {
    @Test
    void baseUriTest(){
     Response res= given()
                .baseUri("https://httpbin.org")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .extract().response();
     String url=res.path("url");
        Assert.assertEquals(url,"https://httpbin.org/get");
    }
}
