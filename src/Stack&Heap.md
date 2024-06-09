Bộ nhớ heap thường lưu những đối tượng có thời gian sống lâu hơn so với stack. Ví dụ như một đối tượng được tạo trong
hàm main() và được giữ cho đến khi chương trình kết thúc.

Còn bộ nhớ Stack thường lưu những biến tham chiếu, biến cục bộ, biến tạm thời, biến địa phương, biến hàm, biến phương
thức.
Những biến này có điểm chung là thời gian sống ngắn, tức là chỉ tồn tại trong một phạm vi nhất định.

Ví dụ như

```java
//lưu bộ nhớ stack || lưu vào bộ nhớ heap
Employee emp = new Employee();
```

**Object** là một class cha của tất cả các class trong Java.
Mỗi class trong Java đều kế thừa từ class Object.

```java
 Object emp = new Employee();
```

**InstanceOf** là một toán tử trong Java được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện của một lớp
cụ thể hay không.

```java
Employee emp = new Employee();
if(emp instanceof Employee){
        System.out.println("emp is an instance of Employee");
}
```

Tính đóng gói (Encapsulation) là một trong bốn tính chất của lập trình hướng đối tượng (OOP).
Nó cho phép che giấu thông tin, bảo vệ dữ liệu khỏi sự thay đổi từ bên ngoài.

dúng những access modifier như private, protected, public để khai báo các biến hoặc hàm trong class
làm sao cho chúng bảo mật và đóng gói dữ liệu.
về Khía cạnh người dùng, họ sẽ không thấy được khai báo biến hay hàm gì , và họ cũng không cần biết.
họ sẽ được duùng qua những hàm getter và setter để truy cập và thay đổi dữ liệu.để đảm bảo cho đối tượng được bảo mật

```java

