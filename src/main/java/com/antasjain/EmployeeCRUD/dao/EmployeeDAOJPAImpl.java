package com.antasjain.EmployeeCRUD.dao;

import com.antasjain.EmployeeCRUD.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager){
        this.entityManager=entityManager;

    }
    @Override
    public List<Employee> findAll() {
        TypedQuery query = entityManager.createQuery("FROM Employee", Employee.class);
        List<Employee> listEmployee = query.getResultList();
        return listEmployee;
    }
}
