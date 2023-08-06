package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = {"usr_email","usr_identity"}))
public class User extends Base{
	
	@Column(name="usr_name")
	private String name;
	
	@Column(name="usr_surname")
	private String surname;
	
	@NotBlank(message = "El campo 'identity' no puede estar vacio")
	@Column(unique = true, name="usr_identity")
	private String identity;
	
	@Column(unique = true, name="usr_email")
	@Email(message = "El campo 'correo' debe ser una dirección de correo válida")
	private String email;
	
	@Column(name="usr_password")
	private String password;
}
