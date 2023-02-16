package com.gumsy.service.impl;

import com.gumsy.dao.RoleDao;
import com.gumsy.entity.Role;
import com.gumsy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {

        return roleDao.findAll();
    }

}
