package com.onco.misc;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

public class Deletelead {
	
	public void delete() throws IOException {

		RestAssured.baseURI = "https://omsobelixstg.onco.com";

		Response res = RestAssured.given().contentType("application/json")

				.headers("", " ").contentType("application/json")
				.body("{\n" + 
						"    \"phoneNumber\": \"+918310744975\",\n" + 
						"    \"leadDelSecKey\": \"Eno0nduK!tthakaPPa@1\"\n" + 
						"}")
				.when().post("/onco-auth/oapi/user-cred/remove-lead");

		System.out.print(res.prettyPrint());

	}

}


