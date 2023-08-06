package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Classroom;
import com.example.demo.model.ClassroomView;

public interface IClassroomService extends IGenericService<Classroom, Integer>{

	List<ClassroomView> listSumStudentsClassroom() throws Exception;
}
