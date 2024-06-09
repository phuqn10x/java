package com.phudeptrai.overrideNoverload;


public class Main {
    public static void main(String[] args) {
        Overload overload = new Overload();
        OverRide overRide = new OverRide();
//        Gọi các overload method bằng các tham số nhận vào
        overload.overload(1,5L);
        overload.overload(1,1);
//      hai hàm này sẽ khác nhau bởi ở có 1 hàm đã bị override lại
        System.out.println(overload.overload(1,1));
        System.out.println(overRide.overload(1,1));//hàm override là hàm này


    }
}
