package com.mvcTest.service.impl;

import com.mvcTest.dao.CRUD_dao;
import com.mvcTest.entity.Student;
import com.mvcTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class StudentServiceImpl implements StudentService {

    private Logger logger = Logger.getLogger(String.valueOf(StudentServiceImpl.class));

    @Qualifier("studentDaoImpl")
    @Autowired
    private CRUD_dao<Student> studentDao;

    @Override
    public List<Student> userListWithModific() throws InstantiationException, IllegalAccessException {
        logger.info(" logging work");
        List<Student> studentList = studentDao.listAll(Student.class);
        for (Student student : studentList) {
            student.setName(student.getName() + " -word");
        }
        return studentList;
    }

    @Override
    public Map<Student, String> userListWithCel() throws InstantiationException, IllegalAccessException {
        List<Student> studentList =  studentDao.listAll(Student.class);
        Map<Student, String> userSelary = new HashMap<>();
        for (int i = 0; i < studentList.size(); i++) {
            userSelary.put(studentList.get(i), String.valueOf(i + 100));
        }
        return userSelary;
    }

    @Override
    public Student getById() {
        return null;
    }
}
