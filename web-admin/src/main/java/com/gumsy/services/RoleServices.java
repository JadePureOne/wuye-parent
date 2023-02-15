package com.gumsy.services;

import com.gumsy.entity.Role;

import java.util.List;

public interface RoleServices {
    List<Role> findAll();

    Role findById(int id);

    void save(Role role);

    void deleteById(int id);
}
