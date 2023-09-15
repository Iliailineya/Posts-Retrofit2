package org.example.app.model;

import org.example.app.entity.Post;
import org.example.app.network.ApiClient;
import org.example.app.network.ApiService;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

import static org.example.app.utils.Constants.POSTS_URL;

public class PostModel {
    public List<Post> getAllPosts() {
        ApiClient client = new ApiClient();
        ApiService apiService = client.getApiService(POSTS_URL);

        try {
            Response<List<Post>> response = apiService.getPosts().execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                System.err.println("Request for all posts failed with code: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Post getPostById(int id) {
        ApiClient client = new ApiClient();
        ApiService apiService = client.getApiService(POSTS_URL);

        try {
            Response<Post> response = apiService.getPostById(id).execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                System.err.println("Request for post ID " + id + " failed with code: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

