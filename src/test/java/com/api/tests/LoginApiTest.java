package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest {

    @Test(description = "Verify Login API is working...")
    public void loginTest() {

        RestAssured.baseURI = "http://64.227.160.186:8080";
//        RestAssured.basePath="/api/auth";
        RequestSpecification given = RestAssured.given();
        RequestSpecification header = given.header("Content-Type", "application/json");
        RequestSpecification body = header.body("{\n" +
                "  \"username\": \"tester123\",\n" +
                "  \"password\": \"tester123\"\n" +
                "}'");
        Response post = body.post("/api/auth/login");
        post.prettyPrint();

        Assert.assertEquals(post.getStatusCode(), 200);
    }
}
