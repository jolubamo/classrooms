package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="criteria")
public class Criteria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cri_id")
	private Integer id;
	
	@Column(name="cri_description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="lvl_id",nullable = false, foreignKey = @ForeignKey(name = "fk_criteria_level"))
	private Level level;
	
	@ManyToOne
	@JoinColumn(name="dim_id",nullable = false, foreignKey = @ForeignKey(name = "fk_criteria_dimension"))
	private Dimension dimension;
}
