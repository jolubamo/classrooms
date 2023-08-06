package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="classroom")
public class Classroom extends Base{
	
	@Column(name= "cla_name")
	private String nombre;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="lvl_id",nullable = false, foreignKey = @ForeignKey(name = "fk_classroom_level"))
	private Level level;
	
	@Column(name="cla_max_student")
	private int maxStudent;
	
	@OneToOne
	@JoinColumn(name= "tea_id")
	private Teacher teacher;
}
