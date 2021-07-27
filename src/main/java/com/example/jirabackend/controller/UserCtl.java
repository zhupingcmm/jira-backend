package com.example.jirabackend.controller;

import com.example.jirabackend.service.IAuthServ;
import com.example.jirabackend.vo.Response;
import com.example.jirabackend.vo.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserCtl {

    private final IAuthServ authServ;

    @Autowired
    public UserCtl(IAuthServ authServ) {
        this.authServ = authServ;
    }

    @ResponseBody
    @PostMapping("/login")
    public Response login (@RequestBody UserRequest user) {
        log.info("login User: {}", user);


        return authServ.login(user);
    }

    @ResponseBody
    @PostMapping("/register")
    public Response register (@RequestBody UserRequest user) {
        log.info("register user: {}", user);
        return authServ.register(user);
    }
}
