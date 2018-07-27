package com.itacademy.zakharenkov.task2;

import java.util.Comparator;

/**
 * Created by Рома on 28.07.2018.
 */
public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        return result != 0 ? result : o1.getSurname().compareTo(o2.getSurname());
    }
}
