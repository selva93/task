package com.test.ManagementTask.controller;

import com.test.ManagementTask.entity.model.VendorEmployeeEntity;
import com.test.ManagementTask.service.VendorEmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vendorEmployee")
@Controller
public class VendorEmpController extends CRUDController<VendorEmployeeEntity> {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public VendorEmpController(VendorEmpService empService) {
        super(empService);
    }
}
