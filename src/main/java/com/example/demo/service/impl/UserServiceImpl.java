package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	
	
	@Override
	public List<User> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(User t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User listById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
