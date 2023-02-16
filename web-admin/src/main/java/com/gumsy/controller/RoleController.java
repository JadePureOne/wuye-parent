package com.gumsy.controller;
import com.gumsy.entity.Role;
import com.gumsy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping
    public String findAll(Map map) {
        //service的方法
        List<Role> rolelist = roleService.findAll();
        //放入ruquest域
        map.put("list", rolelist);
        //去往页面
        return "role";

    }

}
