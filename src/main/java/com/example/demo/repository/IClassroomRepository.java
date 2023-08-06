package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Classroom;

public interface IClassroomRepository extends IGeneralRepository<Classroom, Integer>{

	@Query(value = "select count(*) from student s where cla_id = :id", nativeQuery = true)
	Long countStudentsByClassroom(@Param("id") Integer id);
}
