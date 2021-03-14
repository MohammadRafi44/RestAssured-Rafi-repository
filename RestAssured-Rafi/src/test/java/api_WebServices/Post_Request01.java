// Source - https://www.youtube.com/watch?v=mkIliGAePBM

/*how to create requests and test for 
GET
POST
PUT
PATCH
DELETE

These are some of the json libraries that can be used 
gson
jackson
son
Simple json 
*/


package api_WebServices;
		
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post_Request01 {
	
	@Test
	public void post_01() {
		//We have to create a map object and convert it into jason body to post

//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Mohammad");
//		map.put("job", "Trainer");
		
//		System.out.println(map);
		
		//how to convert this to json object -like below
		JSONObject request1 = new JSONObject();
		
		//above we used map object , instead that we can directly put the json body with jason object - request method
		request1.put("name", "Mohammad");
		request1.put("job", "Trainer");
		
		System.out.println(request1.toJSONString());
		//For json serialization
		System.out.println(request1.toJSONString());
		
		given().
			//for the below conditions 
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request1.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
		//status code 201 is for successful post request creation
			statusCode(201);
	}
	
	@Test
	public void put_01() {
		//We have to create a map object and convert it into jason body to post

//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Mohammad");
//		map.put("job", "Trainer");
		
//		System.out.println(map);
		
		//how to convert this to json object -like below
		JSONObject request1 = new JSONObject();
		
		//above we used map object , instead that we can directly put the json body with jason object - request method
		request1.put("name", "Mohammad");
		request1.put("job", "Trainer");
		
		System.out.println(request1.toJSONString());
		//For json serialization
		System.out.println(request1.toJSONString());
		
		given().
			//for the below conditions 
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request1.toJSONString()).
		when().
			put("https://reqres.in/api/users").
		then().
		//status code 201 is for successful post request creation
			statusCode(200).
			log().all();
	}
	
	@Test
	public void patch_01() {
		//We have to create a map object and convert it into jason body to post

//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Mohammad");
//		map.put("job", "Trainer");
		
//		System.out.println(map);
		
		//how to convert this to json object -like below
		JSONObject request1 = new JSONObject();
		
		//above we used map object , instead that we can directly put the json body with jason object - request method
		request1.put("name", "Mohammad");
		request1.put("job", "Trainer");
		
		System.out.println(request1.toJSONString());
		//For json serialization
		System.out.println(request1.toJSONString());
		
		given().
			//for the below conditions 
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request1.toJSONString()).
		when().
			patch("https://reqres.in/api/users").
		then().
		//status code 201 is for successful post request creation
			statusCode(200).
			log().all();
	}
	
	@Test
	public void delete_01() {
			
		when().
			delete("https://reqres.in/api/users").
		then().
		//status code 201 is for successful post request creation
			statusCode(204).
			log().all();
	}
}
