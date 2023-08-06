package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Level;
import com.example.demo.service.impl.LevelServiceImpl;

@RestController
@RequestMapping(path="api/level")
public class LevelController extends GeneralControllerImpl<Level, LevelServiceImpl>{

}
