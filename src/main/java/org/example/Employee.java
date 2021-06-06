package org.example;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void getInfo() {
        System.out.println("Employee information:\n" +
                "Name: " + this.name + "\n" +
                "Position: " + this.position + "\n" +
                "Email: " + this.email + "\n" +
                "Phone: " + this.phone + "\n" +
                "Salary: " + this.salary + "\n" +
                "Age: " + this.age + "\n" +
                "-------------------------");
    }
}
