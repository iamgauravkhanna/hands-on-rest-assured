package examples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ValidateContentType {

	public static void main(String... strings) {

		RestAssured.baseURI = "http://services.groupkt.com/state/get/USA/all";

		if (RestAssured.given().when().get(RestAssured.baseURI).then().assertThat()
				.contentType(ContentType.JSON) != null) {

			System.out.println("Content Type is JSON");

		}

	}

}