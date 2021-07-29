package com.example.jirabackend.service;

import com.example.jirabackend.vo.Response;
import com.example.jirabackend.vo.UserRequest;

public interface IAuthServ {
    Response register (UserRequest userRequest);

    Response login (UserRequest userRequest);

    Response getUser (String token);
}
