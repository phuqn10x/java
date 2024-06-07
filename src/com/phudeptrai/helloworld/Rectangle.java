package com.phudeptrai.helloworld;

//Class
public class Rectangle {
//    có thể sử dụng biến và hàm trực tiếp và không cần tạo đối tượng

//    tạo biến class | biến static ?
    static int count = 0;
//  tạo phương thức class | phương thức static ?
    public static int calculatePerimeter(int length, int width) {
        return (length + width) * 2;
    }

    public static void main(String[] args) {
        System.out.println(calculatePerimeter(4, 5));
    }
}
