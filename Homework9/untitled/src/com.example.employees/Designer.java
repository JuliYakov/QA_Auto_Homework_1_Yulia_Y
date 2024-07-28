package com.example.employees;

public class Designer extends Employee {

    public Designer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is designing the interface.");
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + " is a designer.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println(getName() + " is a designer. " + extraInfo);
    }
}
