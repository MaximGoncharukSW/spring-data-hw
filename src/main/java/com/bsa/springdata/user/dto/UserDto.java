package com.bsa.springdata.user.dto;

import com.bsa.springdata.office.OfficeDto;
import com.bsa.springdata.team.dto.TeamDto;
import com.bsa.springdata.user.User;

import java.util.UUID;

public class UserDto {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final int experience;
    private final OfficeDto office;
    private final TeamDto team;

    public static UserDto fromEntity(User user) {
        return UserDto
                .builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .experience(user.getExperience())
                .office(OfficeDto.fromEntity(user.getOffice()))
                .team(TeamDto.fromEntity(user.getTeam()))
                .build();
    }
}
