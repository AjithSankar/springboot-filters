package com.test.springbootfilters.service;

import com.test.springbootfilters.entity.EmployeeSearchCriteria;
import com.test.springbootfilters.entity.Employee;
import com.test.springbootfilters.entity.EmployeePage;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Page<Employee> getEmployeesByFilters(EmployeePage employeePage,
                                         EmployeeSearchCriteria employeeSearchCriteria);

    Employee addEmployee(Employee employee);
}
