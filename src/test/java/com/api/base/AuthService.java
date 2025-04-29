package com.api.base;

import com.api.models.request.LoginRequest;
import io.restassured.response.Response;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/api/auth/";
    private static final String BASE_URL = "http://64.227.160.186:8080/";

    public Response login(LoginRequest payload) {
        return postRequest(BASE_URL, payload, BASE_PATH + "login");

    }

}
