package com.phudeptrai.helloworld;

// Đối tượng
public class Person {
//  Instance variable | biến đối tượng ?
//  biến khai báo trong 1 class
//  không như class ,biến và phương thức không thể sử dụng trực tiếp mà cần phải tạo qua đối tượng
    String name;
    int age;
    double height;
//  getter and setter
//  getter: lấy giá trị của biến
//  setter: gán giá trị cho biến

//  Constructor
//  phương thức khởi tạo một đối tượng của class ngay sau khi lưu đối tượng
//  Constructor không có kiểu trả về
//  Constructor sẽ giúp cho việc khởi tạo đối tượng trở nên dễ dàng hơn

    public Person() {

    }

    public Person(String name, int age, double height) {
        // Biến local ,chỉ tồn tại trong block
//        String name1= name;
        this.name = name;
        this.age = age;
        this.height = height;
    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//  Instance method | hàm đối tượng ?
//  phương thức khai báo trong 1 class

    public void sayHello() {
        System.out.println(" says hello" + name);
    }
}
