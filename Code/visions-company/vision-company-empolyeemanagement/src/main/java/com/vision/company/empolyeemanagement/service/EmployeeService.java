/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.service;

import com.vision.company.empolyeemanagement.entity.Employee;
import java.util.List;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author nourhan.mohamed
 */
public interface EmployeeService {
    void addEmployee(Employee employee);
    List <Employee>getEmployeeLsit(Integer pageNo, Integer pageSize, String sortBy);
    
    
}
