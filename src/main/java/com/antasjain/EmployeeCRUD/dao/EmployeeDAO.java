package com.antasjain.EmployeeCRUD.dao;

import com.antasjain.EmployeeCRUD.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
