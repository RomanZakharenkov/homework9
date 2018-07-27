package com.itacademy.zakharenkov.task1;

import java.util.List;

import static com.itacademy.zakharenkov.task1.CollectionUtils.*;

/*
 * Created by Рома on 27.07.2018.
 *
 * IT-academy. Lesson 9.
 * Homework 9
 *
 * Написать метод markLength4, принимающий в качестве
    параметра список (List) строк и размещающий строку &quot;****&quot;
    перед каждым четырёхсимвольным элементом.
    Оригинальные элементы должны остаться на месте.
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> list = buildArrayList();
        System.out.println(list.toString());
        markLength4(list);
        System.out.println(list.toString());
    }
}
