package com.test.ManagementTask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface CRUDDao<T> extends JpaRepository<T, Serializable> {
}
