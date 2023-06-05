package tms.karpovich.lesson13Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Homework {
    public static void main(String[] args) throws FileNotFoundException {
        wordsInAlphabetOrder();
        eliminateDuplicates();
        tenItemsByCategory();
    }
    private static void wordsInAlphabetOrder() {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        Set<String> result = new TreeSet<>(List.of(text.split(" ")));
        System.out.println(result);
    }
    private static void eliminateDuplicates() throws FileNotFoundException {
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        Set<String> result = new TreeSet<>();
        while(scanner.hasNextInt()){
            result.add(scanner.next());
        }
        System.out.println(result);
    }
    private static void tenItemsByCategory() {
        Map<String, List<String>> map = new HashMap<>();
        List<String> berries = new ArrayList<>();
        List<String> fruits = new ArrayList<>();
        List<String> vegetables = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String type;
        String item;
        for (int i = 0; i < 10; i++){
            System.out.println("Input type: berries / fruits / vegetables");
            type = scanner.nextLine();
            System.out.println("Input item");
            item = scanner.nextLine();
            switch (type) {
                case "berries" -> {
                    berries.add(item);
                    map.put(type, berries);
                }
                case "fruits" -> {
                    fruits.add(item);
                    map.put(type, fruits);
                }
                case "vegetables" -> {
                    vegetables.add(item);
                    map.put(type, vegetables);
                }
            }

        }
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
