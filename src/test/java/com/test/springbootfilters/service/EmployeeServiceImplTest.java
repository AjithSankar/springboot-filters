package com.test.springbootfilters.service;

import com.test.springbootfilters.dao.EmployeeRepository;
import com.test.springbootfilters.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeServiceImplTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @Test
    void getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Ajith","sankar","ajith@gmail.com"));
        employeeList.add(new Employee(2,"Ravi","Kumar","ravi@gmail.com"));

        when(employeeRepository.findAll()).thenReturn(employeeList);
        List<Employee> allEmployeesFromService = employeeService.getAllEmployees();
        assertEquals(2,allEmployeesFromService.size());
    }

    @Test
    void getEmployeesByFilters() {
    }

    @Test
    void addEmployee() {
    }
}