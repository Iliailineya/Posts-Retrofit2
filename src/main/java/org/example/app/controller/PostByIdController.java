package org.example.app.controller;

import org.example.app.entity.Post;
import org.example.app.model.PostModel;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.ItemByIdView;

public class PostByIdController {

    private final PostModel model;
    private final ItemByIdView view;

    public PostByIdController(PostModel model, ItemByIdView view) {
        this.model = model;
        this.view = view;
    }

    public void getPostById() {
        view.getOutput(readPostById(
                Integer.parseInt(view.getData())
        ));
        AppStarter.startApp();
    }

    public String readPostById(int id) {
        Post post = model.getPostById(id);
        if (post == null) {
            return Constants.NO_DATA_MSG;
        } else {
            return "Post ID: " + post.id() + "\n" +
                    "Title: " + post.title() + "\n" + "Body: " + post.body() + "\n" +
                    "UserId: " + post.userId() + "\n";
        }
    }
}