package com.batch_430.employee_management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.batch_430.employee_management.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    Employee findByEmailAndPass(String email, String pass);

    Employee findByEmail(String email);

}