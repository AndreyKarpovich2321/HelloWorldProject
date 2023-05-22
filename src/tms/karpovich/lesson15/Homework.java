package tms.karpovich.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++){
            list.add(new Random().nextInt(23));
        }
        list = list.stream()
                .distinct()
                .filter(v -> v > 7 && v < 17 && v % 2 == 0)
                .map(v -> v * 2)
                .sorted((o1, o2) -> o1.compareTo(o2))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("Elements count - " + list.stream().count());
        System.out.println("Average of elemnts - " + list.stream().mapToInt(v -> v).average());
    }


}
