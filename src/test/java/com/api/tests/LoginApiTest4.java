package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginApiTest4 {

    @Test(description = "Verify Login API is working...")
    public void loginTest() {
        LoginRequest loginRequest = new LoginRequest("tester123","tester123");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);

//        response.prettyPrint();

        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();
        String email = loginResponse.getEmail();
        System.out.println(token);
        System.out.println(email);

    }
}
