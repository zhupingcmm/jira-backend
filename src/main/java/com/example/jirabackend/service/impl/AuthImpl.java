package com.example.jirabackend.service.impl;

import com.example.jirabackend.dao.UserDao;
import com.example.jirabackend.entity.User;
import com.example.jirabackend.service.IAuthServ;
import com.example.jirabackend.vo.Response;
import com.example.jirabackend.vo.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class AuthImpl implements IAuthServ {

    private final UserDao userDao;

    @Autowired
    public AuthImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public Response register(UserRequest userRequest) {
        Response response =  new Response();
        User user = userDao.findByName(userRequest.getUsername());
        if (user != null) {
            response.setErrorCode(1);
            response.setErrMsg("Already have the username been register: " + user.getName());
            response.setData(user);
            log.info("Already have the username been register: {}", user.getName());
            return response;
        }
        user = userDao.save(userRequest.toUser());
        response.setData(user);
        return response;
    }

    @Override
    @Transactional
    public Response login(UserRequest userRequest) {
        Response response = new Response();
        User user = userDao.findByName(userRequest.getUsername());
        response.setData(user);
        return response;
    }

    @Override
    public Response getUser(String token) {
        Response response = new Response();
        User user = userDao.findByToken(token);
        response.setData(user);
        return response;
    }
}
