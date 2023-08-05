package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.model.Base;

@NoRepositoryBean
public interface IGeneralRepository<T extends Base,ID> extends JpaRepository<T, ID>{

}
