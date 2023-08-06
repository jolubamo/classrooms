package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.impl.StudentServiceImpl;

@RestController
@RequestMapping(path="api/student")
public class StudentController extends GeneralControllerImpl<Student, StudentServiceImpl>{

}
