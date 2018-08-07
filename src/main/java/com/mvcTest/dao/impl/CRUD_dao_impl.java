package com.mvcTest.dao.impl;

import com.mvcTest.dao.CRUD_dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CRUD_dao_impl<T> implements CRUD_dao<T> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<T> listAll(Class<T> object) throws IllegalAccessException, InstantiationException {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<?> theQuery = currentSession.createQuery("from T", object.getClass());
        return (List<T>) theQuery.getResultList();
    }

    @Override
    public void remove(T object) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.remove(object);
    }

    @Override
    public void saveOrUpdate(T object) {
        System.out.println("-----------------------------------------------------------------------------------------1");
        Session session = sessionFactory.getCurrentSession();
        System.out.println("-----------------------------------------------------------------------------------------2");
        session.saveOrUpdate(object);
    }
}
