package com.mvcTest.service;

import com.mvcTest.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> userListWithModific() throws InstantiationException, IllegalAccessException;

    Map<Student,String> userListWithCel() throws InstantiationException, IllegalAccessException;

    Student getById();

}
