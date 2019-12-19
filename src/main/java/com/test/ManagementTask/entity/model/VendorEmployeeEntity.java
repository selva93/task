package com.test.ManagementTask.entity.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@JsonSerialize
@Entity
@Data
public class VendorEmployeeEntity {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="emp_id")
    private EmployeeEntity employee;
    private String vendor_emp_name;
    private long period;
//    private Date created_on;
//    private Date updated_on;
//    private int is_active;
//    private int is_delete;
}
