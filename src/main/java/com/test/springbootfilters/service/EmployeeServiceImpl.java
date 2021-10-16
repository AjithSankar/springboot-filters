package com.test.springbootfilters.service;

import com.test.springbootfilters.dao.EmployeeCriteriaRepository;
import com.test.springbootfilters.dao.EmployeeRepository;
import com.test.springbootfilters.entity.EmployeeSearchCriteria;
import com.test.springbootfilters.entity.Employee;
import com.test.springbootfilters.entity.EmployeePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeCriteriaRepository employeeCriteriaRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> getEmployeesByFilters(EmployeePage employeePage,
                                                EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeCriteriaRepository.getAllEmployees(employeePage,employeeSearchCriteria);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
