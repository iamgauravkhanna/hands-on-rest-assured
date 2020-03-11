package examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ValidateDeleteMethod {

    @Test
    public void validateDeleteMethod() {

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        Response response = null;

        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .delete("/delete/11400");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Response :" + response.asString());

        System.out.println("Status Code :" + response.getStatusCode());

    }


}
