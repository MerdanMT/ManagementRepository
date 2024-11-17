package com.management.ManagementSystem.serviceImpl;

import com.management.ManagementSystem.entity.Employee;
import com.management.ManagementSystem.repository.EmployeeRepository;
import com.management.ManagementSystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {

        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {

        employeeRepository.save(employee);
    }

    @Override
    public void update(Long id, Employee employee) {

        Employee foundedId = employeeRepository.findById(id).orElse(null);
        foundedId.setDepartment(employee.getDepartment());
        foundedId.setAddress(employee.getAddress());

        employeeRepository.save(foundedId);
    }

    @Override
    public void delete(long id) {

        employeeRepository.deleteById(id);
    }
}
