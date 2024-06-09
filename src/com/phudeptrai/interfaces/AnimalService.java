package com.phudeptrai.interfaces;
//có thể nói hàm interface là bậc cao hơn của abstract class
//cũng có thể coi interface là cha của mọi class
public interface AnimalService {
//    trong 1 interface chỉ chứa các phương thức trừu tượng và phương thức bảo mật là public
//    và hằng số
    public static int AGE = 10;
    public abstract void eat();
    public abstract void sleep();
//không ghi từ khóa abstract cũng được (ngầm hiểu là abstract
    void run();
    void sound();
}
