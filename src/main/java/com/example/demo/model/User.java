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
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_id")
	private Integer id;
	
	@Column(name="usr_name")
	private String name;
	
	@Column(name="usr_surname")
	private String surname;
	
	@Column(name="usr_identity")
	private String identity;
	
	@Column(name="usr_email")
	private String email;
}
