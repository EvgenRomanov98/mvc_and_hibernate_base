package com.mvcTest.service.impl;

import com.mvcTest.dao.CRUD_dao;
import com.mvcTest.dao.impl.CRUD_dao_impl;
import com.mvcTest.service.CRUD_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUD_service_impl<T> implements CRUD_service<T> {

//    @Autowired
//    CRUD_dao<T> crud_dao;

    private CRUD_dao_impl<T> crud_dao_impl = new CRUD_dao_impl<>();

    @Override
    public List<T> listAll(Class<T> object) throws IllegalAccessException, InstantiationException {
        return crud_dao_impl.listAll(object);
    }

    @Override
    public void remove(T object) {
        crud_dao_impl.remove(object);
    }

    @Override
    public void saveOrUpdate(T object) {
        crud_dao_impl.saveOrUpdate(object);
    }
}
