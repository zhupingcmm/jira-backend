package com.example.jirabackend.service;

import com.example.jirabackend.vo.ProjectRequest;
import com.example.jirabackend.vo.Response;

public interface IProjectServ {
    Response findAll () ;

    Response save(ProjectRequest projectRequest);
}
