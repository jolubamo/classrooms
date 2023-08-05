package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class User extends Base{
	
	@Column(name="usr_name")
	private String name;
	
	@Column(name="usr_surname")
	private String surname;
	
	@Column(name="usr_identity")
	private String identity;
	
	@Column(name="usr_email")
	private String email;
	
	@Column(name="usr_password")
	private String password;
}
