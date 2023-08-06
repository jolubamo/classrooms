package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.service.impl.RoleServiceImpl;

@RestController
@RequestMapping(path="api/role")
public class RoleController extends GeneralControllerImpl<Role, RoleServiceImpl>{

}
