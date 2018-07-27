package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 27.07.2018.
 */
public class Student {

    private String name;
    private String surname;
    private Integer age;
    private Double averageScore;

    public Student(String name, String surname, Integer age, Double averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }
}
