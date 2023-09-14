package org.example.app.network;

import okhttp3.OkHttpClient;
import org.example.app.utils.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static ApiService usersApiService;
    private static ApiService postsApiService;

    public ApiService getUsersApiService() {
        if (usersApiService == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.USERS_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            usersApiService = retrofit.create(ApiService.class);
        }
        return usersApiService;
    }

    public ApiService getPostsApiService() {
        if (postsApiService == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            postsApiService = retrofit.create(ApiService.class);
        }
        return postsApiService;
    }
}

