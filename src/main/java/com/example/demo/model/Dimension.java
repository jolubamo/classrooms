package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="dimension")
public class Dimension {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dim_id")
	private Integer id;
	
	@Column(name="dim_name")
	private String name;
	
}
