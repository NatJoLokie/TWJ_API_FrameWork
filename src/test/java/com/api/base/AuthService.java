package com.api.base;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/api/auth/";
    private static final String BASE_URL = "http://64.227.160.186:8080/";

    public Response login(LoginRequest payload) {
        return postRequest(payload, BASE_PATH + "login");

    }

    public Response signUp(SignUpRequest payload) {
        return postRequest(payload, BASE_PATH + "signup");

    }

    public Response forgotPassword(String emailAddress) {
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
        return postRequest(payload, BASE_PATH + "forgot-password");
    }

}
