package com.example.demo.service;

import java.util.List;

public interface IGenericService<T, ID> {

	List<T> list() throws Exception;

	ID save(T t) throws Exception;

	void update(T t) throws Exception;

	void delete(ID id) throws Exception;
	
	T listById(ID id) throws Exception;
	
}
