package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Classroom;
import com.example.demo.repository.IClassroomRepository;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IClassroomService;

@Service
public class ClassroomServiceImpl extends GeneralServiceImpl<Classroom, Integer> implements IClassroomService{

	@Autowired
	private IClassroomRepository classroomRepo;
	
	public ClassroomServiceImpl(IGeneralRepository<Classroom, Integer> generalRepository) {
		super(generalRepository);
	}

}
