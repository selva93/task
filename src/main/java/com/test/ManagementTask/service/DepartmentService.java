package com.test.ManagementTask.service;

import com.test.ManagementTask.dao.DepartmentDAO;
import com.test.ManagementTask.entity.model.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends CRUDService<DepartmentEntity> {
    @Autowired
    public DepartmentService(DepartmentDAO departDao)
    {
        super(departDao);
    }
}
