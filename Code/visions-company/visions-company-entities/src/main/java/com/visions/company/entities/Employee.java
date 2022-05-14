/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visions.company.entities;

import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
/**
 *
 * @author nourhan.mohamed
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    String id ; 
    @Column(name = "name")    
    String name; 
    @Column(name = "email")    
    String email;
    @Column(name = "phone")        
    String phone; 

    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }
    
       
    
}
