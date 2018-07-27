package com.itacademy.zakharenkov.task2;

import java.util.Comparator;

/**
 * Created by Рома on 28.07.2018.
 */
public class StudentAverageScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageScore().compareTo(o2.getAverageScore());
    }
}
