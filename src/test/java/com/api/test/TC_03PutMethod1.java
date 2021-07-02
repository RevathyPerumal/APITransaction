package com.api.test;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_03PutMethod1 {
	
	@Test
	
	public void put1() {
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		
		//System.out.println("Header line is " +response.getHeaders());
		JSONObject json = new JSONObject();
		json.put("name", "Revathy");
		json.put("job", "zio resident");
		req.body(json.toString());
		Response resp = req.put("https://reqres.in/api/users/2");
		
		String data = resp.prettyPrint();
		//System.out.println("Status data is" +data);
	}

}
