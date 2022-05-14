/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.service;

import com.vision.company.empolyeemanagement.entity.Employee;
import com.vision.company.empolyeemanagement.repo.EmployeeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author nourhan.mohamed
 */
@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeeLsit(Integer pageNo, Integer pageSize, String sortBy) {
        System.out.println("EmployeeServiceImp ::getEmployeeLsit pageNo:" + pageNo + " pageSize:" + pageSize + " sortBy:" + sortBy);
        try {
            Pageable paging = PageRequest.of(pageNo - 1, pageSize, Sort.by(sortBy).descending());
            Page<Employee> pagedResult = employeeRepository.findAll(paging);            //long totalCount = whiteListRepo.count();
            return pagedResult.getContent();
        } catch (Exception e) {
            System.out.println("Exception in EmployeeServiceImp :: getEmployeeLsit as '" + e.getMessage() + "'");
        }
        return new ArrayList<Employee>();
    }

}
