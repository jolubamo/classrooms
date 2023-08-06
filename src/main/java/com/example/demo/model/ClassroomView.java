package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Subselect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Subselect("select t.id, CASE WHEN COUNT(s.id) IS NULL THEN 0 ELSE COUNT(s.id) END AS total_students from teacher t left join classroom c on c.tea_id = t.id left join student s on s.cla_id = c.id group by t.id")
public class ClassroomView extends Base{
	
	@OneToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private Teacher teacher; 
	
	@Column(name = "total_students", insertable = false, updatable = false)
	private int totalStudents;
}
