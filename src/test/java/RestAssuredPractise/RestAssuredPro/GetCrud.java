package RestAssuredPractise.RestAssuredPro;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetCrud {
	
	@Test(enabled =false)
	public void getReq() {
		Response resp = RestAssured.get("https://reqres.in/api/users");
		System.out.println(resp.getBody().prettyPrint()+":"+ resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
	}
	@Test(enabled =false)
	public void testcase01() {
	     baseURI = "https://reqres.in/api/users";
		 RestAssured.given().queryParam("page", "3").when().get().then().statusCode(200);
	}@Test
	public void FetchData() {
	     baseURI = "https://reqres.in/api/users";
		 Response resp = RestAssured.given().when().get();
		 
		 JsonPath  path = resp.jsonPath();
		 String name = path.getString("data[0].first_name");
		 System.out.println("Name: "+name);
		 String pageN = path.getString("page");
		 System.out.println("pageN "+pageN);
		 
		 
	}

}
