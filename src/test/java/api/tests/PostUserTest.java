package api.tests;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class PostUserTest {
    @Test
    void postUserTest(){
        String requestBody="{\n" +
                "  \"name\": \"Adarsh\",\n" +
                "  \"role\": \"SDET\"\n" +
                "}";
      Response res= given()
                .contentType("application/json")
                .baseUri("https://httpbin.org")
                 .body(requestBody)
                .when()
                .post("/post")
              .then()
              .statusCode(200)
              .extract().response();
         String name= res.path("json.name");
         String role= res.path("json.role");
         Assert.assertEquals(name,"Adarsh","Given name is not matching");
         Assert.assertEquals(role,"SDET","Given role is not matching");


    }
}
