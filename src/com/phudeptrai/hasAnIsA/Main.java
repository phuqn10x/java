package com.phudeptrai.hasAnIsA;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("z");
        employee.setName("test");
//        employee.setAddress("aaaa");
        Address address = new Address();
        address.setStreet("123 tran hung dao");
        employee.setAddress(address);
        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getStreet());
    }
}
