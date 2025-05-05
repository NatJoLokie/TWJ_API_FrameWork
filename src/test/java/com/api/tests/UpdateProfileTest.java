package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test(description = "Verify Update User Profile API is working...")
    public void updateUserProfileTest() {

        LoginRequest loginRequest = new LoginRequest("tester123", "tester123");

        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);

        String token = loginResponse.getToken();
        System.out.println(token);

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        Response profile = userProfileManagementService.getProfile(token);
        profile.prettyPrint();

        ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest.Builder()
                .firstName("Testo")
                .lastName("Auto")
                .email("Test@auto.com")
                .mobileNumber("7559667441")
                .build();

        Response response1 = userProfileManagementService.updateProfile(token, profileUpdateRequest);

        response1.prettyPrint();

    }
}
