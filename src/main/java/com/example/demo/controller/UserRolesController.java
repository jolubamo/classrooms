package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRole;
import com.example.demo.service.impl.UserRoleServiceImpl;

@RestController
@RequestMapping(path="api/user-role")
public class UserRolesController extends GeneralControllerImpl<UserRole, UserRoleServiceImpl>{

}
