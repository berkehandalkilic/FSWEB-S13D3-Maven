package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String sex;
    double height;
    double weight;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firstName, String lastName, int age, String sex, double height, double weight) {
        this(firstName, lastName, age);
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19 ? true : false;
    }
}
