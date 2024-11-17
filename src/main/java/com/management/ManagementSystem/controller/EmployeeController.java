package com.management.ManagementSystem.controller;

import com.management.ManagementSystem.entity.Employee;
import com.management.ManagementSystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/get_all")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable long id){
        return employeeService.findById(id);
    }

    @PostMapping("/employees/save")
    public void save(@RequestBody Employee employee){
        employeeService.save(employee);
    }

    @PutMapping("/employees/update/{id}")
    public void update(@PathVariable Long id,@RequestBody Employee employee){
        employeeService.update(id, employee);
    }

    @DeleteMapping("/employees/delete/{id}")
    public void delete(@PathVariable long id){
        employeeService.delete(id);
    }
}
