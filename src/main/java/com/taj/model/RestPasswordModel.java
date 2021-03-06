package com.taj.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by User on 8/13/2018.
 */
public class RestPasswordModel {

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 11, message="email should have at least 2 characters")
    private String user_email;
    private String user_password;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 450, min = 1, message="role should have at least 1 characters")
    private String login_role;

    public RestPasswordModel(@NotNull @NotBlank @NotEmpty @Size(max = 450, min = 11, message = "email should have at least 2 characters") String user_email, @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 8, message = "password should have at least 8 characters") String user_password,
                             @NotNull @NotBlank @NotEmpty @Size(max = 450, min = 1, message = "role should have at least 1 characters") String login_role) {
        this.user_email = user_email;
        this.user_password = user_password;
        this.login_role = login_role;
    }

    public RestPasswordModel() {
    }


    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getLogin_role() {
        return login_role;
    }

    public void setLogin_role(String login_role) {
        this.login_role = login_role;
    }
}
