package com.mvcTest.dao;

import com.mvcTest.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllUserWithNameAndPintOnly();

    Student UserByUsername(String name);

    Student getById(long id);

}
