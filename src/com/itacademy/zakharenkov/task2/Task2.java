package com.itacademy.zakharenkov.task2;

import java.util.ArrayList;
import java.util.List;

import static com.itacademy.zakharenkov.task2.StudentUtils.*;

/**
 * Created by Рома on 27.07.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Student> students = buildStudents();
        print(students);

        System.out.println("The smartest student - " + findSmartestStudent(students));

        sortByFullName(students);
        System.out.println("Sorted by full name:");
        print(students);

        sortByAge(students);
        System.out.println("Sorted by age:");
        print(students);

        sortByAverageScore(students);
        System.out.println("Sorted by average score:");
        print(students);
    }
}
