package com.management.ManagementSystem.service;


import com.management.ManagementSystem.entity.Employee;
import com.management.ManagementSystem.entity.User;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(long id);

    void save(Employee employee);

    void update(Long id,Employee employee);

    void delete(long id);

}
