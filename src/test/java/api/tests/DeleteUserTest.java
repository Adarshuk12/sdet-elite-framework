package api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class DeleteUserTest {
    @Test
    void deleteUser(){
       Response response= given()
                .baseUri("https://httpbin.org")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract().response();
       //String json=response.path("json.json");
        //Assert.assertEquals(json,null,"Its not matching");

    }
}
