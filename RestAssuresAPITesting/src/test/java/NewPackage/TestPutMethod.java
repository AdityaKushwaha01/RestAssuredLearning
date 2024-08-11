package NewPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestPutMethod {
	@Test
	void test04() {
		JSONObject jsondata = new JSONObject();
		jsondata.put("name", "Kushwaha");
		jsondata.put("Job", "SDET");
		
		RestAssured.baseURI = "https://reqres.in/api/users/241";
		RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON).body(jsondata.toJSONString()).when().put()
		.then().statusCode(200).log().all();
	}

}
