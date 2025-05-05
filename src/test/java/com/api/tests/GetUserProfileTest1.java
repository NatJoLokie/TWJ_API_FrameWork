package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUserProfileTest1 {

    @Test(description = "Verify Get User Profile API is working...")
    public void getUserProfileTest() {

        LoginRequest loginRequest = new LoginRequest("tester123","tester123");

        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
//        Response response = authService.login(new LoginRequest("tester123", "tester123"));
        LoginResponse loginResponse = response.as(LoginResponse.class);

        String token = loginResponse.getToken();
        System.out.println(token);

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response = userProfileManagementService.getProfile(token);

        response.prettyPrint();


    }
}
