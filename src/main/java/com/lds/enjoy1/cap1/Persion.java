package com.lds.enjoy1.cap1;

public class Persion {
    private String name;
    private Integer age;

    public Persion(){}
    public Persion(String name, Integer age) {
        System.out.println("初始化Persion构造器了。。。。。");
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
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
