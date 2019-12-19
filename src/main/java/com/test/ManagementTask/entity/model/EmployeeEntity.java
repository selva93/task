package com.test.ManagementTask.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Date;


@XmlRootElement
@JsonSerialize
@Entity
public class EmployeeEntity implements Serializable {

    private String emp_name;
    @Id
    @GeneratedValue
    private int id;
    private String emp_number;
    private String emp_address;
    @CreationTimestamp
    private Date created_on;
    @UpdateTimestamp
    private Date updated_on;
    private int is_active;
    private int is_delete;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "department_id", nullable = false)
    private DepartmentEntity dep_id;

    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private FullTimeEmployeeEntity full_time_emp;

    @JsonIgnore
    @OneToOne(mappedBy="employee",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private VendorEmployeeEntity vendor_emp;

    public EmployeeEntity() {
    }
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(String emp_number) {
        this.emp_number = emp_number;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public DepartmentEntity getDepartment() {
        return dep_id;
    }

    public void setDepartment(DepartmentEntity department) {
        this.dep_id = department;
    }

    public FullTimeEmployeeEntity getFull_time_emp() {
        return full_time_emp;
    }

    public void setFull_time_emp(FullTimeEmployeeEntity full_time_emp) {
        this.full_time_emp = full_time_emp;
    }

    public VendorEmployeeEntity getVendor_emp() {
        return vendor_emp;
    }

    public void setVendor_emp(VendorEmployeeEntity vendor_emp) {
        this.vendor_emp = vendor_emp;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
