package api_WebServices;

import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import static io.restassured.RestAssured.*;
import java.util.Map;
import java.util.HashMap;

public class Examples {

//	@Test
	public void test() {

		baseURI = "http://localhost:3000/";
		
		given().
//			param("name","Automation").
			get("/posts").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	public void test_post() {
		
		JsonObject request = new JsonObject();
//		request.put("firstName","TOM");
		
	}
}
