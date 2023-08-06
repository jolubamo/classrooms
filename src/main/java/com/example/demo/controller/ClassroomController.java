package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Classroom;
import com.example.demo.service.impl.ClassroomServiceImpl;

@RestController
@RequestMapping(path = "api/classroom")
public class ClassroomController extends GeneralControllerImpl<Classroom, ClassroomServiceImpl> {

	@GetMapping("view")
	public ResponseEntity<?> listSumStudentsClassroom() throws Exception {

		try {
			return ResponseEntity.status(HttpStatus.OK).body(servicio.listSumStudentsClassroom());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error en servidor.\"}");
		}
	}
	
}
