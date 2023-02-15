package com.gumsy.services.impl;

import com.gumsy.dao.RoleDao;
import com.gumsy.entity.Role;
import com.gumsy.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServicesImpl implements RoleServices {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public Role findById(int id) {
        return null;
    }

    @Override
    public void save(Role role) {

    }

    @Override
    public void deleteById(int id) {

    }
}
