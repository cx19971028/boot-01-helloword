package com.atguigu.boot.bean;

public class Pet {

    private String name;
    private Integer age;
    private String addr;
    private String gir4;
    private String hot_fix_commit2;
    private String hot_fix;
    private String getHot_fix;
    private String pull_test;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
