package com.springdata.emp.service;

import com.springdata.emp.model.Employee;
import com.springdata.emp.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException;

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long employeeId, Employee employeeDetails) throws ResourceNotFoundException;

    Map<String, Boolean> deleteEmployee(Long employeeId) throws ResourceNotFoundException;
}
