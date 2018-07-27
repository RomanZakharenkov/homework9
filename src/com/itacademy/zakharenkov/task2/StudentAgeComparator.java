package com.itacademy.zakharenkov.task2;

import java.util.Comparator;

/**
 * Created by Рома on 28.07.2018.
 */
public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
