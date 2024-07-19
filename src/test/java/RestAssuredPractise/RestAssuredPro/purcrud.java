package RestAssuredPractise.RestAssuredPro;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class purcrud {

		@Test
		public void testCase1() {
			JSONObject putdata = new JSONObject();
			putdata.put("Anand", "Anand");
			putdata.put("job", "TytAnalyst");
			baseURI = "https://reqres.in/api/users";
			basePath = "/757";
			given().contentType(ContentType.JSON)
			.when().put().then().log().all();
		}
}
