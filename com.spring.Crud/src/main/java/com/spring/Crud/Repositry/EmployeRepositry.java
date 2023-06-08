package com.spring.Crud.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Crud.Entity.Employe;

public interface EmployeRepositry extends JpaRepository<Employe, Long> {

}
