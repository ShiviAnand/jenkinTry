package RestAssuredPractise.RestAssuredPro;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class basicOath {
	

	@Test(enabled = false)
	public void basicOath() {
		baseURI = "http://postman-echo.com";
		basePath= "/basic-auth";
		
		Response resp= given().auth().basic("postman", "password").get();
		System.out.println(resp.getStatusLine());
		
	}
	@Test(enabled = false)
	public void digestOath() {
		baseURI = "https://httpbin.org";
		basePath= "/digest-auth/undefined/Mxnplan/Mxnplan";
		
		Response resp= given().auth().digest("Mxnplan", "Mxnplan").get();
		System.out.println(resp.getStatusLine());
		
	}
	@Test(enabled = false)
	public void BearerOath() {
		baseURI = "https://gorest.co.in";
		basePath= "/public/v2/users";
		JSONObject obj =  new JSONObject();
		obj.put("name", "ocg");
		obj.put("gender", "Male");
		obj.put("email", "ocg@gmail.com");
		obj.put("status", "Active");
		
		String token = "Bearer 81d53771ecf8e7a6b83fd726b3eea85f9a2bef63f04eb520d9d3f47667717a1c";
		
	
		ValidatableResponse resp= given().header("Authorization", token).contentType(ContentType.JSON)
				.body(obj.toJSONString()).log().body().when().post().then().log().all();
		
	}//https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
	@Test(enabled = false)
	public void apiKeyOath() {
		baseURI = "https://api.openweathermap.org";
		basePath= "/data/2.5/weather";
		Response resp= given().queryParam("lat", "44.34").queryParam("lon", "40").queryParam("appid", "41fbe940bffd583e2477a6032f4616e9").get();
		
	}
	@Test()
	public void Oath2() {
		baseURI = "https://api.openweathermap.org";
		basePath= "/data/2.5/weather";
		Response resp= given().queryParam("lat", "44.34").queryParam("lon", "40").queryParam("appid", "41fbe940bffd583e2477a6032f4616e9").get();
		
	}
	

}
