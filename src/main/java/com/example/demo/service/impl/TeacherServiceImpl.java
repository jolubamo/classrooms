package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.ITeacherService;

@Service
public class TeacherServiceImpl extends GeneralServiceImpl<Teacher, Integer> implements ITeacherService{

	@Autowired
	private IUserRepository userRepo;
	
	public TeacherServiceImpl(IGeneralRepository<Teacher, Integer> generalRepository) {
		super(generalRepository);
	}

}
