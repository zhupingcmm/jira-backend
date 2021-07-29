package com.example.jirabackend.service.impl;

import com.example.jirabackend.dao.ProjectDao;
import com.example.jirabackend.entity.Project;
import com.example.jirabackend.service.IProjectServ;
import com.example.jirabackend.utils.StringUtil;
import com.example.jirabackend.vo.ProjectRequest;
import com.example.jirabackend.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Slf4j
@Service
public class ProjectImpl implements IProjectServ {
    private final ProjectDao projectDao;

    @Autowired
    public ProjectImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public Response findAll() {
        Response response = new Response();
        response.setData(projectDao.findAll());
        return response;
    }


    @Override
    public Response save(ProjectRequest projectRequest) {
        Response response = new Response();
        response.setData(projectDao.save(projectRequest.toProject()));
        return response;
    }

    @Override
    public Response findByNameOrPersonId(String name, String personId) {
        Response response = new Response();

        if (StringUtil.isFalsy(name) && StringUtil.isFalsy(personId)) {
            response.setData(projectDao.findAll());
        }
        if (StringUtil.isFalsy(name) && !StringUtil.isFalsy(personId)) {
            response.setData(Arrays.asList(projectDao.findByPersonId(Integer.parseInt(personId))));
        }

        if (!StringUtil.isFalsy(name) && StringUtil.isFalsy(personId) ) {
            response.setData(Arrays.asList(projectDao.findByName(name)));
        }
        return response;
    }
}
