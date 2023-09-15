package org.example.app.network;

import org.example.app.entity.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ApiService {

    @GET("api/users")
    Call<UsersResponse> getUsers();

    @GET("api/users/{id}")
    Call<UserResponse> getUserById(@Path("id") int id);

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/{id}")
    Call<Post> getPostById(@Path("id") int id);
}
