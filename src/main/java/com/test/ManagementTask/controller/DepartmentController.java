package com.test.ManagementTask.controller;

import com.test.ManagementTask.entity.model.DepartmentEntity;
import com.test.ManagementTask.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/empDepartment")
@Controller
public class DepartmentController extends CRUDController<DepartmentEntity>{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public DepartmentController(DepartmentService deptService) {
        super(deptService);
    }
}