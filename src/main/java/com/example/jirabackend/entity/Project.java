package com.example.jirabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Basic
    @Column(name = "person_id", nullable = false, unique = true)
    private Integer personId;

    @Basic
    @Column(name = "organization", nullable = false, unique = true)
    private String organization;

    @Basic
    @Column(name = "created", nullable = false, unique = true)
    private Date created;

}
