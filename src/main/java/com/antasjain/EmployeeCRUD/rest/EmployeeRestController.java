package com.antasjain.EmployeeCRUD.rest;

import com.antasjain.EmployeeCRUD.Entity.Employee;
import com.antasjain.EmployeeCRUD.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}
