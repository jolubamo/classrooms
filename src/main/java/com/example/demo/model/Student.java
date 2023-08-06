package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="student")
public class Student extends Base{
	
	@OneToOne
	@JoinColumn(name="usr_id")
	private User user;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="cla_id",nullable = false, foreignKey = @ForeignKey(name = "fk_student_classroom"))
	private Classroom classroom;
	
}
