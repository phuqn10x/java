package com.phudeptrai.polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
//      Đa hình
//      tức là 1 đối tượng có thể tồn tại dưới nhiều hình thức khác nhau

//      (kiểu dữ liệu cho biến)
//      lưu ý chỉ có thể gọi biến có kiểu dữ liệu là lớp cha và trỏ tới lớp con để tạo một đối tượng mới
//      và chỉ áp dụng một đối tượng con có 1 lớp cha
        Person p = new Employee();

        emp.setName("Nguyen Van A");
        emp.setAge(20);
        emp.setSalary("1000$");
        p.setName("Nguyen Van B");
        p.setAge(25);
//      trong thời gian gõ code (compile time)
//      thì java sẽ gọi hàm trong class của biến, kiểu dữ liệu tham chiếu
//      chỉ có thể gọi các phương thức và biến của lớp cha
//      vì trong thời gian này đối tượng person không có setSalary
//      p.setSalary("2000$");
//      trong thời gian run code (run time)
//      thì java sẽ gọi hàm trong class thực sự của đối tượng
        emp.info();
        p.info();


    }
}
