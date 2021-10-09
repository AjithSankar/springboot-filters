package com.test.springbootfilters.controller;

import com.test.springbootfilters.entity.EmployeeSearchCriteria;
import com.test.springbootfilters.entity.Employee;
import com.test.springbootfilters.entity.EmployeePage;
import com.test.springbootfilters.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<Page<Employee>> getAllEmployeesByFilter(EmployeePage employeePage,
                                                                  EmployeeSearchCriteria employeeSearchCriteria){
        return new ResponseEntity<>(employeeService.getEmployeesByFilters(employeePage,employeeSearchCriteria),
                HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.OK);
    }
}
