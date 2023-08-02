package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="classroom")
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cla_id")
	private Integer codigo;
	
	@Column(name= "cla_name")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="lvl_id",nullable = false, foreignKey = @ForeignKey(name = "fk_classroom_level"))
	private Level level;
	
	@Column(name="cla_max_student")
	private int maxStudent;
	
	@MapsId
	@OneToOne
	@JoinColumn(name= "tea_id")
	private Teacher teacher;
}
