package com.batch_430.employee_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch_430.employee_management.dao.EmployeeDao;
import com.batch_430.employee_management.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public Employee register(Employee employee) {
        return dao.save(employee);
    }

    @Override
    public Employee login(String email, String pass) {
        return dao.findByEmailAndPass(email, pass);
    }
}