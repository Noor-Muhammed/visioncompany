/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.repo;

import org.springframework.stereotype.Repository;
import com.vision.company.empolyeemanagement.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author nourhan.mohamed
 */
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
    
}
