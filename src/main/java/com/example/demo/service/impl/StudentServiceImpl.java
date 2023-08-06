package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl extends GeneralServiceImpl<Student, Integer> implements IStudentService{

	public StudentServiceImpl(IGeneralRepository<Student, Integer> generalRepository) {
		super(generalRepository);
	}

}
