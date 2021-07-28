package com.example.jirabackend.controller;

import com.example.jirabackend.service.IUserInfoServ;
import com.example.jirabackend.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserInfoCtl {

    private final IUserInfoServ userInfoServ;

    @Autowired
    public UserInfoCtl(IUserInfoServ userInfoServ) {
        this.userInfoServ = userInfoServ;
    }

    @ResponseBody
    @GetMapping("/users")
    public Response getUsers () {
        return userInfoServ.findAll();
    }


}
