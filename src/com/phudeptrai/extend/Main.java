package com.phudeptrai.extend;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setSalary(1000);
        staff.setName("phudeptrai");
        System.out.println(staff.getSalary());
        System.out.println(staff.getName());

//      đã kế thừa từ Person nên có thể sử dụng các thuộc tính và phương thức của Person
//        staff.setName("Nguyen Van A");
//        staff.setAge(20);
    }
}
