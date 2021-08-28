package com.atguigu.boot.repository.impl;

import com.atguigu.boot.bean.Student;
import com.atguigu.boot.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Integer, Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1,"zhangsan", 22));
        studentMap.put(2, new Student(2,"lisi", 23));
        studentMap.put(3, new Student(3,"wangwu", 24));

    }

    @Override
    public Collection<Student> findaAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}
