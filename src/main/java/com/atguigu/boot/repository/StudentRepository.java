package com.atguigu.boot.repository;

import com.atguigu.boot.bean.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository {
    public Collection<Student> findaAll();

    public Student findById(Integer id);
    public void saveOrUpdate(Student student);
    public void deleteById(Integer id);

}
