package tms.karpovich.lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        List<String> secondStrings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        secondStrings.add("fourth");
        secondStrings.add("fifth");
        strings.addAll(secondStrings);
        strings.removeAll(secondStrings);
        strings.add(2,"next");
        System.out.println(strings.contains("1"));
        System.out.println(strings.indexOf("1"));
        strings.remove("next");
        strings.remove(4);
        strings.set(1,"23");
        strings.size();
        strings.subList(1,2);
        Collections.sort(secondStrings);
        Collections.reverse(secondStrings);
        Collections.shuffle(secondStrings);
    }
}
