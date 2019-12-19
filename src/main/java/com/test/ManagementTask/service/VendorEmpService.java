package com.test.ManagementTask.service;

import com.test.ManagementTask.dao.VendorEmpDAO;
import com.test.ManagementTask.entity.model.VendorEmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorEmpService extends CRUDService<VendorEmployeeEntity> {
    @Autowired
    public VendorEmpService(VendorEmpDAO empDao)
    {
        super(empDao);
    }
}
