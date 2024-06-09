package com.phudeptrai.polymorphism;

public class Employee extends Person{
    String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public void info() {
        System.out.println("class con");
    }
}
