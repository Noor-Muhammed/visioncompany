/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.contoller;

import com.vision.company.empolyeemanagement.entity.Employee;
import com.vision.company.empolyeemanagement.entity.Vocation;
import com.vision.company.empolyeemanagement.entity.VocationType;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.vision.company.empolyeemanagement.service.EmployeeService;
import java.io.IOException;
import org.springframework.http.MediaType;

/**
 *
 * @author nourhan.mohamed
 */
@RestController
@RequestMapping(value = "/")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public void saveEmployeeProfile(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping
    public List< Employee> getAllEmployee(
            @RequestParam(name = "pageNo", defaultValue = "1", required = false) Integer pageNo,
            @RequestParam(name = "pageSize", defaultValue = "30", required = false) Integer pageSize,
            @RequestParam(name = "sortBy", defaultValue = "id", required = false) String sortBy) throws IOException {
        System.out.println("EmployeeController ::getAllEmployee pageNo:" + pageNo + " pageSize:" + pageSize + " sortBy:" + sortBy);
        return service.getEmployeeLsit(pageNo, pageSize, sortBy);
    }
    
    /*@RequestMapping(
            value = "/requestVocation",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void requestVocation(@RequestBody Vocation vocation ) {
        System.out.println("EmployeeController ::requestVocation vocation:" + vocation);
        //return service.(id);
    }*/
    
    
    
    
    
    
}


