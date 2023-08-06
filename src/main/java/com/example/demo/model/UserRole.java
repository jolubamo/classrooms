package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_role")
public class UserRole extends Base{

	@ManyToOne(optional = false)
	@JoinColumn(name="usr_id",nullable = false, foreignKey = @ForeignKey(name = "fk_usr_rol_user"))
	private User user;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="rol_id",nullable = false, foreignKey = @ForeignKey(name = "fk_usr_rol_role"))
	private Role role;
}
