package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dimension;
import com.example.demo.service.impl.DimensionServiceImpl;

@RestController
@RequestMapping(path="api/dimension")
public class DimensionController extends GeneralControllerImpl<Dimension, DimensionServiceImpl>{

}
