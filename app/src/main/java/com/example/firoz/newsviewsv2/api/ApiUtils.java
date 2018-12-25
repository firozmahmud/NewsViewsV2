package com.example.firoz.newsviewsv2.api;


public class ApiUtils {
    private static final String BASE_URL = "";

    private ApiUtils() {
    }

    public static ApiService getService() {
        return ApiClient.getClient(BASE_URL).create(ApiService.class);
    }
}
