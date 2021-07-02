package com.api.test;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_04DeleteMethod {
	@Test
	public void Delete() {
		
		RequestSpecification req = RestAssured.given();
		/*
		req.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "Revathy");
		json.put("job", "Automation");
		json.put("email", "revarathi@gmail.com");	
		req.body(json.toString());
		*/
		Response resp = req.delete("https://reqres.in/api/users/2");
		String data = resp.asString();
		System.out.println("JSON format" +data);
		int code = resp.getStatusCode();
		System.out.println("Status code is" +code);
		
		String line = resp.getStatusLine();
		System.out.println("Status line is" +line);
		Assert.assertEquals(code, 204);

	}

}
