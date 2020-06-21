package com.bsa.springdata.role;

import com.bsa.springdata.user.User;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

// TODO: Map table roles to this entity
public class Role {
    private UUID id;
    private String name;
    private String code;
    private Set<User> users = new HashSet<>();
}
