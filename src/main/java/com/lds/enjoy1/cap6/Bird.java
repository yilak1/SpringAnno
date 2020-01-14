package com.lds.enjoy1.cap6;

import org.springframework.beans.factory.annotation.Value;

public class Bird {
    @Value("zhangsan")
    private String name;
    @Value("#{2 - 1}")
    private Integer age;
    @Value("${bird.color}")
    private String color;
    public Bird(){}
    public Bird(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
