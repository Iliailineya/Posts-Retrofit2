package org.example;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import java.io.IOException;
import java.util.List;

public class PostFetcher {

    public static void main(String[] args) {
        OkHttpClient httpClient = new OkHttpClient.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        // Отримати всі пости
        List<Post> allPosts = getAllPosts(apiService);
        if (allPosts != null) {
            System.out.println("All Posts:");
            printPosts(allPosts);
        }

        // Отримати і вивести пост за ID
        int postIdToFetch = 1; // Змініть це на ID поста, який ви хочете отримати
        Post singlePost = getPostById(apiService, postIdToFetch);
        if (singlePost != null) {
            System.out.println("Single Post (ID " + postIdToFetch + "):");
            printPost(singlePost);
        }
    }

    private static List<Post> getAllPosts(ApiService apiService) {
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

    private static Post getPostById(ApiService apiService, int id) {
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

    private static void printPosts(List<Post> posts) {
        for (Post post : posts) {
            printPost(post);
        }
    }

    private static void printPost(Post post) {
        System.out.println("Post ID: " + post.getId());
        System.out.println("Title: " + post.getTitle());
        System.out.println("Body: " + post.getBody());
        System.out.println("UserId: " + post.getUserId());
        System.out.println();
    }

    interface ApiService {
        @GET("posts")
        Call<List<Post>> getPosts();

        @GET("posts/{id}")
        Call<Post> getPostById(@Path("id") int id);
    }

    static class Post {
        private int id;
        private String title;
        private String body;
        private int userId;

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        public int getUserId() {
            return userId;
        }
    }
}
