package com.bsa.springdata.project.dto;

import com.bsa.springdata.project.Project;

import java.util.UUID;

public class ProjectDto {
    private final UUID id;
    private final String name;
    private final String description;

    public static ProjectDto fromEntity(Project project) {
        return ProjectDto
                .builder()
                .id(project.getId())
                .name(project.getName())
                .description(project.getDescription())
                .build();
    }
}
