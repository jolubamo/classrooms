package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.impl.TeacherServiceImpl;

@RestController
@RequestMapping(path="api/teacher")
public class TeacherController extends GeneralControllerImpl<Teacher, TeacherServiceImpl>{

}
