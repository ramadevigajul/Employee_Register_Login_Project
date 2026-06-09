package com.batch_430.employee_management.service;

import com.batch_430.employee_management.entity.Employee;

public interface EmployeeService {
	
	Employee register(Employee employee);
	Employee login(String email, String pass);

}
