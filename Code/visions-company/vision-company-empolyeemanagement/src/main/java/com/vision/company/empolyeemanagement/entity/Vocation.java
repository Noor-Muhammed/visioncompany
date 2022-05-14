/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author nourhan.mohamed
 */
@Entity
@Table(name = "vocation")
public class Vocation {

    @Id
    @Column(name = "id")
    private String id;
    @JoinColumn(name = "fkvocationType", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private VocationType type;
    @Column(name = "date")
    private String date;
    @JoinColumn(name = "fkemployee", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee fkemployee;

    public Vocation() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VocationType getType() {
        return type;
    }

    public void setType(VocationType type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getFkemployee() {
        return fkemployee;
    }

    public void setFkemployee(Employee fkemployee) {
        this.fkemployee = fkemployee;
    }

    @Override
    public String toString() {
        return "Vocation{" + "id=" + id + ", type=" + type + ", date=" + date + ", fkemployee=" + fkemployee + '}';
    }

    
    
}
