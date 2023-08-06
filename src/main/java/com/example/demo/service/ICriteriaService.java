package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Criteria;

public interface ICriteriaService extends IGenericService<Criteria, Integer>{

	 List<Criteria> getCriteriaByClassroomId(int classroomId) throws Exception;
}
