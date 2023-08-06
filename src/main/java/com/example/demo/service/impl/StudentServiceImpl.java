package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Classroom;
import com.example.demo.model.Student;
import com.example.demo.repository.IClassroomRepository;
import com.example.demo.repository.IGeneralRepository;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl extends GeneralServiceImpl<Student, Integer> implements IStudentService{

	@Autowired
	private IClassroomRepository classroomRepo;
	
	public StudentServiceImpl(IGeneralRepository<Student, Integer> generalRepository) {
		super(generalRepository);
	}

	@Override
	public Student save(Student t) throws Exception {
		
		Classroom classroom = classroomRepo.findById(t.getClassroom().getId()).get();
		
		try {
			if(classroom.getMaxStudent() < classroomRepo.countStudentsByClassroom(classroom.getId())) {
				getRepo.save(t);
				return t;
			}else {
				throw new Exception("El salón ya ha alcanzado el máximo de estudiantes");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}
	
}
