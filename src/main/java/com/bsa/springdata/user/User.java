package com.bsa.springdata.user;

import com.bsa.springdata.office.Office;
import com.bsa.springdata.role.Role;
import com.bsa.springdata.team.Team;
import com.bsa.springdata.user.dto.CreateUserDto;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

// TODO: Map table users to this entity
public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private int experience;
    private Office office;
    private Team team;
    private Set<Role> roles = new HashSet<>();

    public static User fromDto(CreateUserDto user, Office office, Team team) {
        return User.builder()
            .firstName(user.getFirstName())
            .lastName(user.getLastName())
            .experience(user.getExperience())
            .office(office)
            .team(team)
            .build();
    }
}
