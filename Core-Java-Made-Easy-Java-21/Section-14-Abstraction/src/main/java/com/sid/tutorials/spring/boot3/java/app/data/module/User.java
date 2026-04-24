package com.sid.tutorials.spring.boot3.java.app.data.module;

import lombok.Builder;
import lombok.Data;

/**
 * @author kunmu On 22-04-2026
 */
@Data
@Builder
public class User {
    private String userName;
    private String password;


    public User(String username, String password) {
        this.userName = username;
        this.password = password;
    }
}
