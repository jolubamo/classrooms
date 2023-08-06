package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Criteria;
import com.example.demo.service.impl.CriteriaServiceImpl;

@RestController
@RequestMapping(path="api/criteria")
public class CriteriaController extends GeneralControllerImpl<Criteria, CriteriaServiceImpl>{

}
