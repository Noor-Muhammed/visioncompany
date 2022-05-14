/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vision.company.empolyeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nourhan.mohamed
 */
@Entity
@Table(name = "vocationType")
public class VocationType {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "type")
    private String type;

    public VocationType() {
    }

    public VocationType(String id, String type) {
        this.id = id;
        this.type = type;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VocationType{" + "id=" + id + ", type=" + type + '}';
    }

    
}
