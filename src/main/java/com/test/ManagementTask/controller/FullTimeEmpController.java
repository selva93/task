package com.test.ManagementTask.controller;


import com.test.ManagementTask.entity.model.FullTimeEmployeeEntity;
import com.test.ManagementTask.service.FullTimeEmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fullTimeEmp")
@Controller
public class FullTimeEmpController extends CRUDController<FullTimeEmployeeEntity>{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public FullTimeEmpController(FullTimeEmpService fService) {
        super(fService);
    }
}