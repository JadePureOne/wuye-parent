package com.gumsy.controller;

import com.gumsy.entity.Role;
import com.gumsy.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleServices roleServices;

    @RequestMapping
    public String index(Map map) {
        //调用roleservices的获取所有角色方法
        List<Role> rolelist = roleServices.findAll();
        System.out.println(rolelist);
        //将角色列表放入reques域中
        map.put("list", rolelist);
        //转发到渲染界面role/index.html
        return "role/index";
    }

}
