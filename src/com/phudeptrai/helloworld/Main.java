package com.phudeptrai.helloworld;

public class Main {
    public static void main(String[] args) {
//đối tượng
        Person p1 = new Person();
        Person p2 = new Person();
        //không thể can thiệp trực tiếp vào biến và phương thức của class
        p1.setName("John");
        p1.setAge(12);
        p2.setName("Mark");
        p2.setAge(12);
        System.out.println(p1.getAge() + " " + p1.getName());
        System.out.println(p2.getAge() + " " + p2.getName());
        //sử dụng constructor
        Person p3 = new Person("phudeptrai", 12, 1.7);
        System.out.println(p3.getAge() + " " + p3.getName() + " " + p3.getHeight());
//class
        Rectangle hinh1 = new Rectangle();
        Rectangle hinh2 = new Rectangle();
        // có thể sử dụng biến và hàm trực tiếp và không cần tạo đối tượng
        // sử dụng chung biến
        hinh1.count = 10;
        System.out.println(Rectangle.count);
        hinh2.count = 20;
        System.out.println(Rectangle.count);
//      dùng chung biến count nên giá trị của biến count sẽ thay đổi
        System.out.println(hinh1.count);
// Quản lý truy cập
        AccessModifier access = new AccessModifier();
        //...
        access.test = "Abc";
        // private chỉ truy cập trong class
        // access.testPrivate = "Abc";
        // public truy cập từ bất kỳ đâu
        access.testPublic = "Abc";
        // protected truy cập ...
        access.testProtected = "Abc";

    }
}
