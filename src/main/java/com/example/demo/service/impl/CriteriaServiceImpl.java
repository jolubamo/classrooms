package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Criteria;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.ICriteriaService;

@Service
public class CriteriaServiceImpl extends GeneralServiceImpl<Criteria, Integer> implements ICriteriaService{

	public CriteriaServiceImpl(IGeneralRepository<Criteria, Integer> generalRepository) {
		super(generalRepository);
	}

}
