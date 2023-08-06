package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Criteria;
import com.example.demo.service.impl.CriteriaServiceImpl;

@RestController
@RequestMapping(path="api/criteria")
public class CriteriaController extends GeneralControllerImpl<Criteria, CriteriaServiceImpl>{

	@GetMapping("get-by-classroom")
	public ResponseEntity<?> getCriteriaByClassroomId(Integer id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.getCriteriaByClassroomId(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error en servidor.\"}");
		}
	}
	
}
