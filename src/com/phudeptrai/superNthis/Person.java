package com.phudeptrai.superNthis;

public class Person {
     String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Info() {

        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
    }
}
