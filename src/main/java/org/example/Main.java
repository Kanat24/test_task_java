package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 1, 2, 3, 4, 3, 2, 4, 5, 1, 1);
        System.out.println(newMap(integerList));
    }
    public static Map<Integer, Integer> newMap(List<Integer> integerList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer list : integerList) {
            if (map.containsKey(list)) {
                map.put(list, map.get(list) + 1);
            } else map.put(list, 1);
        }
        return map;
    }
}