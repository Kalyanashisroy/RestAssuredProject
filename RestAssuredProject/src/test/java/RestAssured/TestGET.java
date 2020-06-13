package RestAssured;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class TestGET {
	@Test
	public void test_get() {
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			//body("data.id[1]", equals(8)).
			//body("data.first_name", HasItemInArray()).
			log().all();
	}
}
