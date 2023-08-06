package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IRoleService;

@Service
public class RoleServiceImpl extends GeneralServiceImpl<Role, Integer> implements IRoleService{

	public RoleServiceImpl(IGeneralRepository<Role, Integer> generalRepository) {
		super(generalRepository);
	}

}
