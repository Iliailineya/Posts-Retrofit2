package org.example.app.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public record User(@SerializedName("id") int id, @SerializedName("first_name") String firstName,
                   @SerializedName("last_name") String lastName, @SerializedName("email") String email) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String email() {
        return email;
    }


    @Override
    public String toString() {
        return "{\"id\":" + id + "," +
                "\"first_name\":\"" + firstName + "\"," +
                "\"last_name\":\"" + lastName + "\"," +
                "\"email\":\"" + email + "\"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (User) obj;
        return this.id == that.id &&
                Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.email, that.email);
    }


}
