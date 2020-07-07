package br.com.devdojo.model;

import java.util.Arrays;

public class Student {
    private Integer register;
    private String name;
    private Double[] tests;
    private Double average;

    public Student() { }

    public Student(Integer register, String name, Double[] tests) {
        this.register = register;
        this.name = name;
        this.tests = tests;
    }

    public Student(Integer register, String name, Double[] tests, Double average) {
        this.register = register;
        this.name = name;
        this.tests = tests;
        this.average = average;
    }

    public Student(int rm, String name, double[] tests, double average) {
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double[] getTests() {
        return tests;
    }

    public void setTests(Double[] tests) {
        this.tests = tests;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "register=" + register +
                ", name='" + name + '\'' +
                ", tests=" + Arrays.toString(tests) +
                ", average=" + average +
                '}';
    }
}
