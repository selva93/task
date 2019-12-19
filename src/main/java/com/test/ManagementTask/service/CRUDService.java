package com.test.ManagementTask.service;

import com.test.ManagementTask.dao.CRUDDao;

import java.util.List;
import java.util.Optional;

public abstract class CRUDService<T> {
    CRUDDao<T> responseDao;

    public CRUDService(CRUDDao<T> dao) {
        this.responseDao = dao;
    }

    /**
     * Method To Get all Records by ID from DB
     * @param id
     * @return
     */
    public Optional<T> getAllRecordsById(int id) {
        return responseDao.findById(id);
    }

    /**
     * Method  to get all records from DB
     * @param <T>
     * @return
     */
    public <T> List<T> getAllRecords() {
        return (List<T>) responseDao.findAll();
    }

    /**
     * Method to insert records to DB
     * @param data
     * @return
     */
    public T insert(T data) {
        return responseDao.save(data);
    }

    /**
     * Method to update the records in DB
     * @param data
     * @return
     */
    public T updateRecords(T data) {
        return responseDao.save(data);
    }

    /**
     * Method to Delete records From DB
     * @param id
     */
    public void deleteRecordsById(int id) {
        responseDao.deleteById(id);
    }
}
