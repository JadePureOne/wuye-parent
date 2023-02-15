package com.gumsy.dao;

import com.gumsy.entity.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findAll();
    Role findById(int id);
    void save(Role role);
    void deleteById(int id);

}
