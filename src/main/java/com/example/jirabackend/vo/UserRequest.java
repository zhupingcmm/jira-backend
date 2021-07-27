package com.example.jirabackend.vo;

import com.example.jirabackend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String username;

    private String password;

    public User toUser() {

        Random random = new Random(100);
        User user = new User();
        user.setName(this.username);
        user.setPassword(this.password);
        user.setToken(String.valueOf(random.nextInt()));
        return user;
    }
}
