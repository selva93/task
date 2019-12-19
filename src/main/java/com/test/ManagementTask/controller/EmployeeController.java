package com.test.ManagementTask.controller;

import com.test.ManagementTask.entity.model.EmployeeEntity;
import com.test.ManagementTask.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmployeeController extends CRUDController<EmployeeEntity> {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public EmployeeController(EmployeeService empService) {
        super(empService);
    }
}

