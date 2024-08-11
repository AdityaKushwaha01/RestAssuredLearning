package NewPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestDeleteMethod {
	@Test
	public void test06() {
		RestAssured.baseURI = "https://reqres.in/api/users/241";
		RestAssured.given().when().delete().then().log().all().statusCode(204);
	}

}
