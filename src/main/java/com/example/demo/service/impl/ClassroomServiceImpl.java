package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Classroom;
import com.example.demo.model.ClassroomView;
import com.example.demo.repository.IClassroomRepository;
import com.example.demo.repository.IClassroomViewRepository;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IClassroomService;

@Service
public class ClassroomServiceImpl extends GeneralServiceImpl<Classroom, Integer> implements IClassroomService{

	@Autowired
	private IClassroomRepository classroomRepo;
	
	@Autowired
	private IClassroomViewRepository classroomViewRepo;
	
	public ClassroomServiceImpl(IGeneralRepository<Classroom, Integer> generalRepository) {
		super(generalRepository);
	}

	@Override
	public List<ClassroomView> listSumStudentsClassroom() throws Exception {
		
		return classroomViewRepo.findAll();
	}

}
