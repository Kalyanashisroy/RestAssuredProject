package RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class DataDriven {
	@DataProvider(name="PostforData")
	public Object[][] DataForPost(){
		Object[][] data=new Object[2][3];
		data[0][0]="Will";
		data[0][1]="Smith";
		data[0][2]=2;
		
		data[1][0]="Kane";
		data[1][1]="Williams";
		data[1][2]=1;
		return data;
	}
	@Test(dataProvider="PostforData")
	public void test_post(String firstName,String lastName,int subjectId) {
			JSONObject request=new JSONObject();
			request.put("firstName", firstName);
			request.put("lastName", lastName);
			request.put("subjectId", subjectId);
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
}
