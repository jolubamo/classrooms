package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Classroom;
import com.example.demo.service.impl.ClassroomServiceImpl;

@RestController
@RequestMapping(path="api/classroom")
public class ClassroomController extends GeneralControllerImpl<Classroom, ClassroomServiceImpl>{

}
