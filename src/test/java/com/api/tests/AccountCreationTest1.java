package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AccountCreationTest1 {

    @Test(description = "Verify Registration API is working...")
    public void createAccountTest(){

        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                .userName("Lokesh007")
                .password("Lokesh@123")
                .firstName("Lokesh")
                .lastName("Waran")
                .email("lok.war74@ymail.com")
                .mobileNumber("7777777777")
                .build();



        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);
        response.prettyPrint();


    }
}
