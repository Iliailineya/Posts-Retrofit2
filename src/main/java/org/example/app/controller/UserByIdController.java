package org.example.app.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.entity.User;
import org.example.app.entity.UserResponse;
import org.example.app.model.UserModel;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.ItemByIdView;
import retrofit2.Response;

import java.util.Optional;

public class UserByIdController {

    UserModel model;
    ItemByIdView view;

    public UserByIdController(UserModel model, ItemByIdView view) {
        this.model = model;
        this.view = view;
    }

    public void getUserById() {
        view.getOutput(readUserById(
                Integer.parseInt(view.getData())
        ));
        AppStarter.startApp();
    }

    private String readUserById(int id) {
        Optional<Response<UserResponse>> optional = model.fetchUserById(id);

        if (optional.isEmpty()) {
            return Constants.NO_DATA_MSG;
        } else {
            Gson gson = new Gson();
            User user = gson.fromJson(String.valueOf(optional.get().body()),
                    new TypeToken<User>() {}.getType());
            return "User: id " + user.id() + ", " + user.lastName() +
                    " " + user.firstName() + ", " + user.email();
        }
    }
}
