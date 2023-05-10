package tms.karpovich.lesson13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new TreeSet<>();
        firstSet.add("first");
        firstSet.add("second");
        firstSet.add("third");
        secondSet.add("first");
        secondSet.add("second");
        secondSet.add("third");
        System.out.println(firstSet);
        System.out.println(secondSet);
        Set<Person> myPersonSet = new TreeSet<>();
        myPersonSet.add(new Person("Pasha","Technik"));
        myPersonSet.add(new Person("Dima","Technik"));
        myPersonSet.add(new Person("Pasha","Tochnik"));
        System.out.println(myPersonSet);
    }
}
