package com.clay;

/**
 * Test
 */
public class Test {
    public static void main(String args[]) {
        Employee em = new Employee("123");
        System.out.println(em.empId);
        System.out.println("sss");
    }
}

class Person {
    String name = "No name";
    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String empId = "0000";
    public Employee(String empId) {
        super(empId);
        this.empId = empId;
    }
}