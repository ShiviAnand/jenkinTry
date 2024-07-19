package RestAssuredPractise.RestAssuredPro;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postcrud {
	@Test
	public void testCase1() {
		JSONObject obt = new JSONObject();
		obt.put("name", "Shivi");
		obt.put("job", "QA");
		
		baseURI = "https://reqres.in/api/users";
		given().header("Content-type","application.json")
		.contentType(ContentType.JSON)
		.body(obt.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();
	}
}
