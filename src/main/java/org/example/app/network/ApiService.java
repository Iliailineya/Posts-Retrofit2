package org.example.app.network;

import org.example.app.entity.PostResponse;
import org.example.app.entity.PostsResponse;
import org.example.app.entity.UserResponse;
import org.example.app.entity.UsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("api/users")
    Call<UsersResponse> getUsers();

    @GET("api/users/{id}")
    Call<UserResponse> getUserById(@Path("id") int id);

    @GET("api/posts")
    Call<PostsResponse> getPosts();

    @GET("api/posts/{id}")
    Call<PostResponse> getPostById(@Path("id") int id);
}
