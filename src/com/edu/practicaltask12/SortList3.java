package com.edu.practicaltask12;
/*
     Write a method for sorting list of Strings using Java 8.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList3 {

    public static void main(String[] args) {

        List<String> activities =
                Arrays.asList("Swimming", "Football", "Dancing", "Running", "Cycling");

        System.out.println(activities);
        System.out.println(sortList(activities));

    }

    public static List<String> sortList(List<String> activities) {
        return activities.stream().sorted().collect(Collectors.toList());
    }
}
