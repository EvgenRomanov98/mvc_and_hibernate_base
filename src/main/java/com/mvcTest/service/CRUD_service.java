package com.mvcTest.service;

import java.util.List;

public interface CRUD_service<T> {

    List<T> listAll(Class<T> object) throws IllegalAccessException, InstantiationException;

    void remove(T object);

    void saveOrUpdate(T object);
}
