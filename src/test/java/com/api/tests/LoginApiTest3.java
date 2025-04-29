package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginApiTest3 {

    @Test(description = "Verify Login API is working...")
    public void loginTest() {
        AuthService authService = new AuthService();
//        Response response = authService.login("{\n" +
//                "  \"username\": \"tester123\",\n" +
//                "  \"password\": \"tester123\"\n" +
//                "}'");

//        response.prettyPrint();

    }
}
