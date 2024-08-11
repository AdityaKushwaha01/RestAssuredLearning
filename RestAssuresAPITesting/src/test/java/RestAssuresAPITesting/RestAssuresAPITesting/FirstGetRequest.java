package RestAssuresAPITesting.RestAssuresAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstGetRequest {
	
	@Test
	void firstCall(){
		Response res =RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println("response code " + res.getStatusCode());
	}

}
