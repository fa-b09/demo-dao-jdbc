/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Department implements Serializable{
    private static final long serialVersionUID=1l;
    
    private Integer Id;
    private String name;
    
    public Department(){
        
    }

    public Department(Integer Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "Department{" + "Id=" + Id + ", name=" + name + '}';
    }
    
    
    
    
}
