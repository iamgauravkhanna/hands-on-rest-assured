package examples;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidateGetMethod {

    @Test
    public void validateGetMethod1() {

        //The base URI to be used
        RestAssured.baseURI = "https://reqres.in/api/users/";

        //Define the specification of request. Server is specified by baseURI above.
        RequestSpecification httpRequest = RestAssured.given();

        //Makes calls to the server using Method type.
        Response response = httpRequest.request(Method.GET);

        //Checks the Status Code
        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}