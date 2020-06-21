package com.bsa.springdata.project;

import com.bsa.springdata.team.Team;

import java.util.List;
import java.util.UUID;

// TODO: Map table projects to this entity
public class Project {
    private UUID id;
    private String name;
    private String description;
    private List<Team> teams;
}
