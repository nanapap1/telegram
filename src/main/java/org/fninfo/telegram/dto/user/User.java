package org.fninfo.telegram.dto.user;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private Long user_id;
    @SerializedName("username")
    private String username;

    public User() {
    }
}