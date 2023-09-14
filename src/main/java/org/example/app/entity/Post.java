package org.example.app.entity;

import com.google.gson.annotations.SerializedName;

public record Post(@SerializedName("userId") int userId, @SerializedName("id") int id,
                   @SerializedName("title") String title, @SerializedName("body") String body) {

    @Override
    public int userId() {
        return userId;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public String body() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
