package com.api.test;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_03PutMethod {	
	
		@Test
	public void put() {
				
	Response resp = RestAssured.put("https://reqres.in/api/users/2");
	//String data = resp.prettyPrint();
	//System.out.println("Status data is" +data);
	int code = resp.getStatusCode();
	System.out.println("Status code is" +code);
	
	String line = resp.getStatusLine();
	System.out.println("Status line is" +line);
	Assert.assertEquals(code, 200);
}



}
