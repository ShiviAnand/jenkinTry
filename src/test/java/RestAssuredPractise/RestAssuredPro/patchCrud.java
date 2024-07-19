package RestAssuredPractise.RestAssuredPro;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class patchCrud {
	@Test
	public void testcase01() {
		JSONObject jsondata = new JSONObject();
		jsondata.put("Anand", "Shivi");
		jsondata.put("job", "TytAnalyst");
		baseURI = "https://reqres.in/api/users";
		basePath = "/757";
		given().contentType(ContentType.JSON)
		.when().patch().then().log().all();
	}

}
