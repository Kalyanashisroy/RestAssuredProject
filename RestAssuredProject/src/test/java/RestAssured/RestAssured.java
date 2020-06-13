package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class RestAssured {
	public static void main(String[] args) {
		System.out.println("Hello");
		RestAssured.test_get();
	}
	//@Test
	public static void test_get() {
		baseURI="http://localhost:3000/";
		given().
			param("name", "Automation").
			get("/subjects").
		then().
			statusCode(200).
			log().all();
	}
	//@Test
	public void test_post() {
		JSONObject request=new JSONObject();
		request.put("firstName", "Steve");
		request.put("lastName", "Smith");
		request.put("subjectId", 1);
		baseURI="http://localhost:3000/";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		}
	//@Test
	public void test_patch() {
		JSONObject request=new JSONObject();
		//request.put("firstName", "Steve");
		request.put("lastName", "Waugh");
		//request.put("subjectId", 1);
		baseURI="http://localhost:3000/";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			log().all();
		}
	//@Test
	public void test_put() {
		JSONObject request=new JSONObject();
		request.put("firstName", "Martin");
		request.put("lastName", "Blank");
		request.put("subjectId", 1);
		baseURI="http://localhost:3000/";
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
		}
	//@Test
	public void test_delete() {
		baseURI="http://localhost:3000/";
		given().
			delete("/user/4").
		then().
			statusCode(200);			
	}
}
