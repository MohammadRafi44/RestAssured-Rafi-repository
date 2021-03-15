package api_WebServices;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.lang.reflect.Method;
import java.util.Hashtable;


/*
 * POST -- Creates new Resource
 * 
 * Put  -- Updates the existing Resource -- by passing all the nodes
 * 
 * Patch -- Udpates existing Resource -- by passing specific node
 */

public class PostPutExamples {

	@Test
	public void test_get01(Hashtable<String , String> data) throws Exception {
		
		/*
		 * baseURI -- is a method coming from RestAssured -- to set baseurl -- eg :- http://localhost
		 */
		baseURI = "http://localhost:3000/";  
		
		given().
		get("/users"). // setting URI path 
		then().
		statusCode(200).
		log().all();
	}
	
	
	
	@Test
	public void test_get02(Hashtable<String , String> data) {
		baseURI = "http://localhost:3000/";
		/*
		 * This is equal to calling "http://localhost:3000/subjects?name=Automation"
		 */
		given().param("name", "Automation").
		get("/subjects").  // URI Path
		then().
		statusCode(200).
		log().all();
	}
	
	
	//@Test
	public void test_post() {
		
		/*
		 * POST is always for creating a resource ( does not matter if it was duplicated )
		 */
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Tom");
		request.put("lastname", "Moody");
		request.put("subjectid", 1);
		request.put("id", 6);
		
		
		baseURI = "http://localhost:3000/";
		
		
		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		
	
	}
	
	//@Test
	public void test_patch() {
		
		/*
		 * PATCH is always for update a resource -- by passing specific node
		 */
		
		JSONObject request = new JSONObject();
		
		request.put("lastname", "Cooper1");
		
		
		
		baseURI = "http://localhost:3000/";
		
		
		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			log().all();
		
	
	}
	
	//@Test
	public void test_put() {
		
		/*
		 * PUT is for checking if resource is exists then update , else create new resource
		 * 
		 * For PUT -- we have to pass complete resource
		 */
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Marry");
		request.put("lastname", "Jane1");
		request.put("subjectid", 1);
		
		
		baseURI = "http://localhost:3000/";
		
		
		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
		
	
	}
	
	//@Test
	public void test_delete() {
		baseURI = "http://localhost:3000/";
		
			delete("/users/4").
		then().
			statusCode(200);
	}
}
