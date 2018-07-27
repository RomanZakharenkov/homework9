package com.itacademy.zakharenkov.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Рома on 27.07.2018.
 */
public class StudentUtils {

    public static List<Student> buildStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alexander", "Pushkin", 19, 7.0));
        students.add(new Student("Lev", "Yashin", 22, 5.0));
        students.add(new Student("Michail", "Lermantov", 24, 8.0));
        students.add(new Student("Nikolay", "Gogol", 21, 9.5));
        students.add(new Student("Anton", "Chehov", 20, 8.8));
        students.add(new Student("Lev", "Tolstoy", 18, 6.1));

        return students;
    }

    public static Student findSmartestStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        Student student = students.get(0);
        iterator.next();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getAverageScore() > student.getAverageScore()) {
                student = currentStudent;
            }
        }

        return student;
    }

    public static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void sortByFullName(List<Student> list) {
        Collections.sort(list, new StudentFullNameComparator());
    }

    public static void sortByAge(List<Student> list) {
        Collections.sort(list, new StudentAgeComparator());
    }

    public static void sortByAverageScore(List<Student> list) {
        Collections.sort(list, new StudentAverageScoreComparator());
    }
}
