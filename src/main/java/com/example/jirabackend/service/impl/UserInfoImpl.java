package com.example.jirabackend.service.impl;

import com.example.jirabackend.dao.UserInfoDao;
import com.example.jirabackend.entity.UserInfo;
import com.example.jirabackend.service.IUserInfoServ;
import com.example.jirabackend.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserInfoImpl implements IUserInfoServ {
    private final UserInfoDao userInfoDao;

    @Autowired
    public UserInfoImpl(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }


    @Override
    public Response findAll() {
        Response response = new Response();
        List<UserInfo> userInfoList = userInfoDao.findAll();
        log.info("Userinfo data: {}", userInfoList);
        response.setData(userInfoList);
        return response;
    }
}
