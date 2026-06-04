/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Seller implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer Id;
    private String name;
    private String email;
    private Date birtDate;
    private Double baseSalary;
    
    private Department department;
    
    public Seller(){
        
    }

    public Seller(Integer Id, String name, String email, Date birtDate, Double baseSalary, Department department) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.birtDate = birtDate;
        this.baseSalary = baseSalary;
        this.department = department;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Id);
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
        final Seller other = (Seller) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "Seller{" + "Id=" + Id + ", name=" + name + ", email=" + email + ", birtDate=" + birtDate + ", baseSalary=" + baseSalary + ", department=" + department + '}';
    }

  
    
    
    
}
