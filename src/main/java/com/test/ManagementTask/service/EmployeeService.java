package com.test.ManagementTask.service;

import com.test.ManagementTask.dao.EmployeeDAO;
import com.test.ManagementTask.entity.model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends CRUDService<EmployeeEntity> {
    @Autowired
    public EmployeeService(EmployeeDAO empDao)
    {
        super(empDao);
    }
}
