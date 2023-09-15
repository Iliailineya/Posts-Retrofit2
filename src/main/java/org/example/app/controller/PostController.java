package org.example.app.controller;

import org.example.app.entity.Post;
import org.example.app.model.PostModel;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.ItemsView;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PostController {

    private final PostModel model;
    private final ItemsView view;

    public PostController(PostModel model, ItemsView view) {
        this.model = model;
        this.view = view;
    }

    public void getPosts() {
        view.getOutput(getAllPosts());
        AppStarter.startApp();
    }

    public String getAllPosts() {
        List<Post> posts = model.getAllPosts();
        if (posts == null) {
            return Constants.NO_DATA_MSG;
        }

        StringBuilder stringBuilder = new StringBuilder();
        AtomicInteger cnt = new AtomicInteger(0);
        String str;

        for (Post post : posts) {
            str = cnt.incrementAndGet() + ") Post ID: " + post.id() + "\n " +
                    "Title: " + post.title() + "\n " + "Body: " + post.body() + "\n " +
                    "UserId: " + post.userId() + "\n";
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}

