package com.example.jirabackend.vo;

import com.example.jirabackend.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectRequest {

    private String name;

    private Integer personId;

    private String organization;

    private Date created;

    public Project toProject () {
        Project project = new Project();
        project.setName(this.name);
        project.setOrganization(this.organization);
        project.setPersonId(this.personId);
        project.setCreated(new Date());
        return project;
    }
}
