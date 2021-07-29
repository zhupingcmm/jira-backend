package com.example.jirabackend.dao;

import com.example.jirabackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectDao extends JpaRepository<Project, Integer> {
    List<Project> findAll();

    Project findByName(String name);

    Project findByPersonId(int personId);


}
