package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Level;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.ILevelService;

@Service
public class LevelServiceImpl extends GeneralServiceImpl<Level, Integer> implements ILevelService{

	public LevelServiceImpl(IGeneralRepository<Level, Integer> generalRepository) {
		super(generalRepository);
	}

}
