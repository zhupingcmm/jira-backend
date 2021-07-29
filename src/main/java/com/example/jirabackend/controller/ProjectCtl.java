package com.example.jirabackend.controller;

import com.example.jirabackend.service.IProjectServ;
import com.example.jirabackend.vo.ProjectRequest;
import com.example.jirabackend.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProjectCtl {

    private final IProjectServ projectServ;

    @Autowired
    public ProjectCtl(IProjectServ projectServ) {
        this.projectServ = projectServ;
    }

    @ResponseBody
    @GetMapping("/projects")
    public Response getProjectList (@RequestParam String name, @RequestParam String personId) {
        log.info("Name is: {}", name);
        log.info("personId is: {}", personId);
        return  projectServ.findByNameOrPersonId(name, personId);
    }


    @ResponseBody
    @PostMapping("/project")
    public Response createProject (@RequestBody ProjectRequest projectRequest) {
        return projectServ.save(projectRequest);
    }
}
