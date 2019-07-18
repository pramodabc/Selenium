package ApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Chap1 {

	public static void main(String[] args) 
	
	
	
	{
		
     /*RestAssured.baseURI="http://localhost:3000/";
		
		given().contentType("application/json")
		.when().get("posts/1")
		.then().log().all();*/
		
	Response response=	RestAssured.get("http://localhost:3000/posts");
	
	System.out.println(response.getStatusCode());
	

	}

}
