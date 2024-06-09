package com.phudeptrai.overrideNoverload;

public class OverRide extends Overload {
//  Override method được hiểu là hàm của class cha sẽ được viết lại trong hàm con
//  có thể sửa lại phần thân hàm
//  hoặc thêm hoặc bớt tham số nhưng với điều kiện các tham số phải giống nhau với tham số của hàm cha
    @Override
    public int overload(int a, int b) {
        return a + b + 10;
    }

}
