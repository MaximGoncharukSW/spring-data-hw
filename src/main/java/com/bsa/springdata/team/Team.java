package com.bsa.springdata.team;

import com.bsa.springdata.project.Project;
import com.bsa.springdata.user.User;

import java.util.List;
import java.util.UUID;

// TODO: Map table teams to this entity
public class Team {
    private UUID id;
    private String name;
    private String room;
    private String area;
    private Project project;
    private List<User> users;
    private Technology technology;
}
