package com.antasjain.EmployeeCRUD.dao;

import com.antasjain.EmployeeCRUD.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
