package com.company;

import java.time.LocalDate;

public class Human {
    private int age;
    private String firstName;
    private String lasName;
    private LocalDate birthDate;
    private int weight;
    Human(int age1, String firstName1, String lasName, LocalDate birthDate1, int weight1) {
        this.age = age1;
        this.firstName = firstName1;
        this.lasName = lasName;
        this.birthDate = birthDate1;
        this.weight = weight1;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
