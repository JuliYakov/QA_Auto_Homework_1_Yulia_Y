package com.example.employees;


public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void work() {
        System.out.println(name + " is working.");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break.");
    }

    public void performJob() {
        System.out.println(getName() + " is performing job duties.");
    }

    public void describeRole() {
        System.out.println(getName() + " is an employee.");
    }
    public void describeRole(String extraInfo) {
        System.out.println(getName() + " is an employee. " + extraInfo);
    }
}

