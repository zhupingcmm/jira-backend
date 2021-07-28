package com.example.jirabackend.dao;

import com.example.jirabackend.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
    List<UserInfo> findAll();
}
