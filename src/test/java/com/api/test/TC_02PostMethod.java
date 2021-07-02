package com.api.test;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_02PostMethod {
	@Test
	public void Post() {
		
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("id", "668");
		json.put("name", "morpheus");		
		json.put("job", "Leader");
		
		req.body(json.toString());
		
		Response resp = req.post("https://reqres.in/api/users");
		String data = resp.prettyPrint();
		System.out.println("Status data is" +data);
		
		int code = resp.getStatusCode();
		System.out.println("Status code is" +code);
		
		String line = resp.getStatusLine();
		System.out.println("Status line is" +line);
		Assert.assertEquals(code, 201);
	}

}
