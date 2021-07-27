package com.example.jirabackend.dao;

import com.example.jirabackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findById(int id);

    User findByName(String name);

}
