package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest1 {
    @Test(description = "Verify Forgot Password API is working...")
    public void ForgotPasswordTest() {

        AuthService authService = new AuthService();

        Response response = authService.forgotPassword("lok.war74@ymail.com");

        response.prettyPrint();


    }
}
