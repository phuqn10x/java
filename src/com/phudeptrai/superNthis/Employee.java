package com.phudeptrai.superNthis;

public class Employee extends Person {
    private int salary;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Info() {
        // this sẽ trỏ về các giá trị của đối tượng hiện tại, super sẽ trỏ về đối tượng cha
        // nếu là private thì không thể truy cập từ class khác
        this.name = "Nguyen Van A";
        super.name = "abc";
        super.Info();
    }
}
