package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Criteria;

public interface ICriteriaRepository extends IGeneralRepository<Criteria, Integer>{

	@Query(value = "EXEC GetCriteriaByClassroomId :classroomId", nativeQuery = true)
    List<Criteria> getCriteriaByClassroomId(@Param("classroomId") int classroomId);
    
}
