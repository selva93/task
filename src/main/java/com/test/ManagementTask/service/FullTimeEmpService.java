package com.test.ManagementTask.service;

import com.test.ManagementTask.dao.FullTimeEmpDAO;
import com.test.ManagementTask.entity.model.FullTimeEmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FullTimeEmpService extends CRUDService<FullTimeEmployeeEntity>{
    @Autowired
    public FullTimeEmpService(FullTimeEmpDAO empDao)
    {
        super(empDao);
    }
}
