package com.sid.tutorials.spring.boot3.java.app.data.module;

import lombok.Builder;
import lombok.Data;

/**
 * @author kunmu On 22-04-2026
 */
@Data
public class User {
    private String userName;
    private String password;

    @Builder
    public User(String username, String password) {
        this.userName = username;
        this.password = password;
    }
}
