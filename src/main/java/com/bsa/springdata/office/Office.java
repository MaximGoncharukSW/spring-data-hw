package com.bsa.springdata.office;

import com.bsa.springdata.user.User;

import java.util.List;
import java.util.UUID;

// TODO: Map table offices to this entity
public class Office {
    private UUID id;
    private String city;
    private String address;
    private List<User> users;
}
