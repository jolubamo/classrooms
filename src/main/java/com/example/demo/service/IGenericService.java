package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Base;

public interface IGenericService<T extends Base, ID> {

	List<T> list() throws Exception;

	T save(T t) throws Exception;

	T update(T t, ID id) throws Exception;

	boolean delete(ID id) throws Exception;
	
	T listById(ID id) throws Exception;
	
}
