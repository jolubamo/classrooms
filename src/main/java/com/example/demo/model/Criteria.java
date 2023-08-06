package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="criteria")
public class Criteria extends Base{
	
	@Column(name="cri_description")
	private String description;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="lvl_id",nullable = false, foreignKey = @ForeignKey(name = "fk_criteria_level"))
	private Level level;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="dim_id",nullable = false, foreignKey = @ForeignKey(name = "fk_criteria_dimension"))
	private Dimension dimension;
}
