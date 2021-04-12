package com.company;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthdate;
    private boolean isMan;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public boolean isMan() {
        return isMan;
    }

    public Person(String name, int age, Date birthdate, boolean isMan) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
        this.isMan = isMan;
    }
}
