package com.luv2code.springboot.demo.cruddemo.service;

import com.luv2code.springboot.demo.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}