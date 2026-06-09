package com.batch_430.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.batch_430.employee_management.entity.Employee;
import com.batch_430.employee_management.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(Employee employee, Model model) {

        service.register(employee);

        model.addAttribute("msg", "Registration Successful");

        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String pass,
                        Model model) {

        Employee emp = service.login(email, pass);

        if (emp != null) {
            model.addAttribute("name", emp.getName());
            return "home";
        }

        model.addAttribute("msg", "Invalid Email or Password");
        return "login";
    }
}