package com.test.ManagementTask.controller;

import com.test.ManagementTask.dto.CustDetailDTO;
import com.test.ManagementTask.dto.ResponseDTO;
import com.test.ManagementTask.service.CustomerService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.Optional;

@RequestMapping("/customer")
@Controller
public class CustomerContoller {

    @Autowired
    private CustomerService customerService;

    /**
     * Method to insert customer details
     * @param date
     * @return
     */
    @PostMapping(value = "/insert", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<CustDetailDTO> add(@RequestBody ResponseDTO date) {
        CustDetailDTO customerDetails = customerService.insertCustomerDetails(date);
        return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }

    /**
     * Method to get customer details from cache
     * @param customerNumber
     * @return
     */
    @ApiResponses({@ApiResponse(code = 200, response = CustDetailDTO.class, message = "ok"), @ApiResponse(code = 404, message = "Unable to get customer details")})
    @GetMapping(value = "/getCustomerDetails/{customer_number}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Object> getCustomerDetails(@PathVariable("customer_number") String customerNumber) {
        Optional<CustDetailDTO> customerDetails = customerService.getCustomerDetails(customerNumber);
        if(customerDetails.isPresent()) {
            return new ResponseEntity<>(customerDetails.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Json("{message : Unable to get customer details}"), HttpStatus.NOT_FOUND);
        }
    }
}
