package NewPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class FirstGetMethod {
	
	@Test
	void test01() {
		Response res =RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response code :" + res.getStatusCode());
		System.out.println("Response body :" + res.getBody().asString());
		System.out.println("Response time :" + res.getTime());
		System.out.println("Response header :" + res.getHeader("Content-Type"));
		
		Assert.assertEquals(200, res.getStatusCode());
	}
	@Test
	void test02() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().queryParam("page", "2")
		.when().get()
		.then().statusCode(200);
	}

}
