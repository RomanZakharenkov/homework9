package com.itacademy.zakharenkov.task1;

import java.util.*;

/**
 * Created by Рома on 27.07.2018.
 */
public class CollectionUtils {

    public static void markLength4(List<String> list) {
        List<String> copyList = new ArrayList<>(list);
        int counter = 0;
        for (int i = 0; i < copyList.size(); i++) {
            if (copyList.get(i).length() == 4) {
                list.add(i + counter++, "****");
            }
        }
    }

    public static List<String> buildArrayList() {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        return list;
    }
}
