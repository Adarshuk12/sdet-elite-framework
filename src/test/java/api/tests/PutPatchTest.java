package api.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutPatchTest {
    @Test(priority = 1)
    void putTest(){
        String requestBody="{\n" +
                "  \"name\": \"Adarsh\",\n" +
                "  \"role\": \"Senior SDET\"\n" +
                "}";
      Response response=  given()
                .contentType(ContentType.JSON)
                .baseUri("https://httpbin.org")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .extract().response();
      String name=response.path("json.name");
      String role=response.path("json.role");
      Assert.assertEquals(name,"Adarsh","Not matching with the name");
      Assert.assertEquals(role,"Senior SDET","not matching with the expected role");
    }
    @Test(priority = 2)
    void patchTest(){
        String requestBody="{\n" +
                "  \"role\": \"SDET\"\n" +
                "}";
        Response response=given()
                .contentType(ContentType.JSON)
                .baseUri("https://httpbin.org")
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .extract().response();
       // String name=response.path("json.name");
        String role=response.path("json.role");
       // Assert.assertEquals(name,"Adarsh","Not matching with the name");
        Assert.assertEquals(role,"SDET","not matching with the expected role");
    }
}
