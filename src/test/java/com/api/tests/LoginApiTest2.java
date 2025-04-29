package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest2 {

    @Test(description = "Verify Login API is working...")
    public void loginTest() {

        RestAssured.baseURI = "http://64.227.160.186:8080";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"username\": \"tester123\",\n" +
                        "  \"password\": \"tester123\"\n" +
                        "}'")
                .post("/api/auth/login");

        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
