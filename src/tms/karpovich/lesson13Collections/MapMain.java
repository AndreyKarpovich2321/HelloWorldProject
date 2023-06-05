package tms.karpovich.lesson13Collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String ,String> firstMap = new HashMap<>();
        Map<Integer ,String> secondMap = new TreeMap<>();
        firstMap.put("first","red");
        firstMap.put("second","orange");
        firstMap.put("third","yellow");
        System.out.println(firstMap.get("third"));
        System.out.println(firstMap.containsKey("third"));
        System.out.println(firstMap.keySet());
        System.out.println(firstMap.values());
        firstMap.forEach((k,v) -> System.out.println(k + " " + v));
        Map<String, List<String>> myMap = new HashMap<>();
        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");
        List<String> phones = new ArrayList<>();
        phones.add("Samsung");
        myMap.put("computers", computers);
        myMap.put("phones", phones);
    }
}
