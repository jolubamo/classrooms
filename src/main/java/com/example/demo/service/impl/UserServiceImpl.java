package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl extends GeneralServiceImpl<User, Integer> implements IUserService{

	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public UserServiceImpl(IGeneralRepository<User, Integer> generalRepository) {
		super(generalRepository);
	}
	
	@Override
	public User save(User t) throws Exception {
		
		t.setPassword(encoder.encode(t.getPassword()));
		
		return super.save(t);
	}

}
