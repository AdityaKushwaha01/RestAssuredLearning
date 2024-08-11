package NewPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CheckValidResponse {
	
	@Test
	public void getSingleUSer(){
		RestAssured.baseURI= "https://reqres.in/api/users/2";
		
		//responsecode validation
		RequestSpecification reqspec =  RestAssured.given();
		Response res =  reqspec.get();
		int rescode = res.getStatusCode(); 
		Assert.assertEquals(rescode,200);
		
		//response line validation
		String statsline = res.getStatusLine();
		Assert.assertEquals(statsline, "HTTP/1.1 200 OK");
	}

}
