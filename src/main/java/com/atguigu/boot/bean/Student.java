package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// 带参数构造
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
