package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserRole;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IUserRoleService;

@Service
public class UserRoleServiceImpl extends GeneralServiceImpl<UserRole, Integer> implements IUserRoleService{

	public UserRoleServiceImpl(IGeneralRepository<UserRole, Integer> generalRepository) {
		super(generalRepository);
	}

}
