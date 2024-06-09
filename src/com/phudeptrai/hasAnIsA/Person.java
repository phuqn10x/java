package com.phudeptrai.hasAnIsA;

public class Person {
    private String name;
    //quan hệ HAS - A , mỗi người có một địa chỉ (has a address)
    private Address address;


    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
