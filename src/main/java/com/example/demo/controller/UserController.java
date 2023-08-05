package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;

@RestController
@RequestMapping(path="api/user")
public class UserController extends GeneralControllerImpl<User, UserServiceImpl>{

}
