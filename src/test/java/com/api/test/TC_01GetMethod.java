package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_01GetMethod {
	
	@Test
	public void ResponseCode() {
		Response resp= RestAssured.get("https://reqres.in/api/users?page=2");
		int code =  resp.getStatusCode();
		System.out.println("Status code is:"+code);
		String line = resp.getStatusLine();
		System.out.println("Line is:" +line);
		
		Assert.assertEquals(code, 200);
	/*
		//String data = resp.asPrettyString();
		String data = resp.asString();
		System.out.println("Response code is" +data);
		System.out.println("Response time" +resp.getTime());
		*/
	}

}
