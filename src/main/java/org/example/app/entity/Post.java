package org.example.app.entity;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    private final int id;
    @SerializedName("title")
    private final String title;
    @SerializedName("body")

    private final String body;
    @SerializedName("userId")

    private final int userId;

    public Post(int id, String title, String body, int userId) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public int id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String body() {
        return body;
    }

    public int userId() {
        return userId;
    }
}
