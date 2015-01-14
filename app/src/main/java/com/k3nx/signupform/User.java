package com.k3nx.signupform;

import java.io.Serializable;

/**
 * Created by Ken Wilcox on 1/14/2015 3:37 PM.
 * Simple user class
 */
public class User implements Serializable {
    private String mUsername;
    private String mPassword;

    User(String username, String password) {
        this.mUsername = username;
        this.mPassword = password;
    }
}
