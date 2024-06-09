package com.phudeptrai.abstracts;
//abstract là một từ khóa dùng để khai báo một lớp trừu tượng
//class này sẽ không thể tự tạo đối tượng mà chỉ có thể tạo đối tượng từ các lớp con của nó
//có thể nói class này sinh ra để làm lớp cha cho các lớp con

public abstract class Person {
    public String name;

//    có abstract class thì sẽ có abstract method
//    abstract method có mục đích là để các lớp con của nó bắt buộc viết lại hàm này (Override) khi kế thừa
//    chỉ tồn tại trong abstract class
    public abstract double Salary(int b,String a);
}
