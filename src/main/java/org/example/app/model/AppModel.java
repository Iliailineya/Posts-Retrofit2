package org.example.app.model;

import org.example.app.controller.PostByIdController;
import org.example.app.controller.PostsController;
import org.example.app.controller.UserByIdController;
import org.example.app.controller.UsersController;
import org.example.app.view.PostByIdView;
import org.example.app.view.PostsView;
import org.example.app.view.UserByIdView;
import org.example.app.view.UsersView;

public class AppModel {

    public void readUsers() {
        UserModel model = new UserModel();
        UsersView view = new UsersView();
        UsersController controller = new UsersController(model, view);
        controller.getUsers();
    }

    public void readUserById() {
        UserModel model = new UserModel();
        UserByIdView view = new UserByIdView();
        UserByIdController controller = new UserByIdController(model, view);
        controller.getUserById();
    }
    public void readPosts() {
        PostModel model = new PostModel();
        PostsView view = new PostsView();
        PostsController controller = new PostsController(model, view);
        controller.getPosts();
    }

    public void readPostById() {
        PostModel model = new PostModel();
        PostByIdView view = new PostByIdView();
        PostByIdController controller = new PostByIdController(model, view);
        controller.getPostById();
    }
}
