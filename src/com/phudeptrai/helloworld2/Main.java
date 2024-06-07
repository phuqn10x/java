package com.phudeptrai.helloworld2;

import com.phudeptrai.helloworld.AccessModifier;

public class Main {
    public static void main(String[] args) {
        AccessModifier access = new AccessModifier();
        access.testPublic = "Abc";
//       biến default không truy cập được khi khác package
//        access.test = "Abc";
//        không truy cập được khi khác package
//        access.testProtected = "Abc";

    }
}
