package org.example.app.model;

import org.example.app.controller.PostByIdController;
import org.example.app.controller.PostController;
import org.example.app.controller.UserByIdController;
import org.example.app.controller.UsersController;
import org.example.app.view.ItemByIdView;
import org.example.app.view.ItemsView;

public class AppModel {

    public void readUsers() {
        UserModel model = new UserModel();
        ItemsView view = new ItemsView();
        UsersController controller = new UsersController(model, view);
        controller.getUsers();
    }

    public void readUserById() {
        UserModel model = new UserModel();
        ItemByIdView view = new ItemByIdView();
        UserByIdController controller = new UserByIdController(model, view);
        controller.getUserById();
    }
    public void readPosts() {
        PostModel model = new PostModel();
        ItemsView view = new ItemsView();
        PostController controller = new PostController(model, view);
        controller.getPosts();
    }

    public void readPostById() {
        PostModel model = new PostModel();
        ItemByIdView view = new ItemByIdView();
        PostByIdController controller = new PostByIdController(model, view);
        controller.getPostById();
    }
}
