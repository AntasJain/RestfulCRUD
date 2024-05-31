package com.antasjain.EmployeeCRUD.services;

import com.antasjain.EmployeeCRUD.Entity.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> findAll();
     Employee findById(int id);
     Employee save(Employee employee);
     void deleteById(int id);

}
