package Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Lviv", "Odessa", "Kherson", "Lutsk", "Chernivtsi", "Kyiv", "Zhytomyr", "Poltava", "Dnipro"));
        Collections.sort(cities, Comparator
                .comparingInt(String::length)
                .thenComparing(String::compareTo));
        System.out.println(cities);
    }
}

