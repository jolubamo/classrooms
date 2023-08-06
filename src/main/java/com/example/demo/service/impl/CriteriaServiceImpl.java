package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Criteria;
import com.example.demo.repository.ICriteriaRepository;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.ICriteriaService;

@Service
public class CriteriaServiceImpl extends GeneralServiceImpl<Criteria, Integer> implements ICriteriaService{

	@Autowired
	private ICriteriaRepository criteriaRepo;
	
	public CriteriaServiceImpl(IGeneralRepository<Criteria, Integer> generalRepository) {
		super(generalRepository);
	}

	@Override
	public List<Criteria> getCriteriaByClassroomId(int classroomId) throws Exception {
		// TODO Auto-generated method stub
		return criteriaRepo.getCriteriaByClassroomId(classroomId);
	}
	
	@Override
	public List<Criteria> list() throws Exception {
		// TODO Auto-generated method stub
		return super.list();
	}

}
