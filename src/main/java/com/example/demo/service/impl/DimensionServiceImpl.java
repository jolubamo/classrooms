package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Dimension;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IDimensionService;

@Service
public class DimensionServiceImpl extends GeneralServiceImpl<Dimension, Integer> implements IDimensionService{

	public DimensionServiceImpl(IGeneralRepository<Dimension, Integer> generalRepository) {
		super(generalRepository);
	}

}
