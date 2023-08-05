	package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

public interface IUserRepository extends IGeneralRepository<User, Integer>{

	@Query(value = "select * from users where usr_email= :email ", nativeQuery = true)
	User searchUserEmail(@Param("email") String email);
	
	@Query(value = "select rol_name from role r inner join user_role ur on ur.rol_id = r.id inner join users u on ur.usr_id = u.id where u.usr_email=:email", nativeQuery = true)
	List<String> searchRolesForUser(@Param("email") String email);
}
