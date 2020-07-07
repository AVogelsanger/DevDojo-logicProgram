package br.com.devdojo.model;

import br.com.devdojo.service.EnlistService;

public class UserMilitary {
    private String name;
    private Character sex;
    private Integer age;

    private EnlistService enlistService;

    public UserMilitary(EnlistService enlistService) {
        this.enlistService = enlistService;
    }

    public UserMilitary(String name, Character sex, Integer age, EnlistService enlistService) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.enlistService = enlistService;
    }

    public UserMilitary(String name, Character sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EnlistService getEnlistService() {
        return enlistService;
    }

    public void setEnlistService(EnlistService enlistService) {
        this.enlistService = enlistService;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", enlistService=" + enlistService +
                '}';
    }
}
