// Source : https://www.youtube.com/watch?v=JJ7Tp7_fX4c
 
package api_WebServices;

import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Get_Request01 {
	
	@Test
	void test_01() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);			
	}
	
	@Test
	void test_02() {
		given().
			//in case if you want to verify the jason request header and parameters
			header("Content-Type","application/json").
//			param(parameterName, parameterValues)
			
			get("https://reqres.in/api/users?page=2").
			then()
			//to check if status code is equal to 200
				.statusCode(200)
				//to check if first id element is equal to 7
				.body("data.id[0]", equalTo(7))
				//printing all the response to console
				.log().all()
				//to check if data response has some items 
				.body("data.first_name", hasItems("Michael","Lindsay"));
		
	}
	
}

	