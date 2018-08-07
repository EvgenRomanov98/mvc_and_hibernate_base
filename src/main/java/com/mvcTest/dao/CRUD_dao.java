package com.mvcTest.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CRUD_dao<T> {

    List<T> listAll(Class<T> object) throws IllegalAccessException, InstantiationException;

    void remove(T object);

    void saveOrUpdate(T object);
}
