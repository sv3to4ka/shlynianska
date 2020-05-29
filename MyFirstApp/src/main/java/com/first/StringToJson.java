package com.first;

public class StringToJson {
    private String name;
    private Integer age;
    private String car;

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

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "StringToJson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car='" + car + '\'' +
                '}';
    }

    ///Create string that contains JSON { "name":"John", "age":30, "car":null }; parse this string into JSON object and print it's name and age.
}
