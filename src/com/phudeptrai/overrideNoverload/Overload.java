package com.phudeptrai.overrideNoverload;

public class Overload {
//    đây là những ví dụ về overload method
//    chúng là những hàm tên giống nhau
//    nhưng khác nhau về kiểu dữ liệu tham số nhận vào
//    cũng như số lượng tham số nhận vào

    public int overload(int a, int b) {
        return a + b;
    }

    public float overload(int a, float b) {
        return a + b;
    }

    public long overload(int a, long b) {
        return a + b;
    }

    public int overload(int a) {
        return a;
    }
}
