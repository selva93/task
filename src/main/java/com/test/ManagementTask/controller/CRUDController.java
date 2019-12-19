package com.test.ManagementTask.controller;

import com.test.ManagementTask.service.CRUDService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class CRUDController<T> {

    private CRUDService<T>  resCRUDService;
    public CRUDController(CRUDService<T> implementation)
    {
        resCRUDService = implementation;
    }

    /**
     * Method  to get all records from DB
     * @return
     */
    @GetMapping(value = "/getAllRecords",  produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getAllRecords() {
        List<T> response = resCRUDService.getAllRecords();
        if(response.size()>0){
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No data available", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Method To Get all Records by ID from DB
     * @param id
     * @return
     */
    @GetMapping(value = "/getAllRecordsById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllRecordsById(@PathVariable("id") int id) {
        Optional<T> response = resCRUDService.getAllRecordsById(id);
        if(response.isPresent()) {
            return new ResponseEntity<>(response.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No data available for given id: "+id, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Method to insert records to DB
     * @param data
     * @return
     */
    @PostMapping(value = "/insertRecords", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> insert(@RequestBody T data) {
        T response = (T) resCRUDService.insert(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * Method to update records in DB
     * @param data
     * @return
     */
    @PostMapping(value = "/updateRecords", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> updateRecords(@RequestBody T data) {
        T response = (T) resCRUDService.updateRecords(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /**
     * Method to delete records by ID from DB
     * @param id
     * @return
     */
    @DeleteMapping(value = "/deleteRecordsById/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> deleteRecordsById(@PathVariable("id") int id) {
        resCRUDService.deleteRecordsById(id);
        return new ResponseEntity<>("Date deleted successfully fot the request id:"+ id, HttpStatus.OK);
    }
}
