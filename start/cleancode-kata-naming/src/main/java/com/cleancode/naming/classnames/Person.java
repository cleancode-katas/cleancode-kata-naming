package com.cleancode.naming.classnames;

public class Person {

    private String name;
    private int age;
    private double salary;

    public Person(String name) {
        this(name, 29, 1200);
    }

    public Person(int age) {
        this("Person", age, 1200);
    }

    public Person(double salary) {
        this("Person", 29, salary);
    }

    public Person(String name, int age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
