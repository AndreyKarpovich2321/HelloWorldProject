package tms.karpovich.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Apple", 10, "Red"));
        fruits.add(new Fruit("Plume", 5, "Violet"));
        fruits.add(new Fruit("Peach", 25, "Yellow"));
        fruits.add(new Fruit("Banana", 25, "Yellow"));
        Predicate<Fruit> colorPredicate = fruit -> fruit.getColor().equals("Yellow");
        Predicate<Fruit> weightPredicate = fruit -> fruit.getWeight() > 15;
        Predicate<Fruit> namePredicate = fruit -> fruit.getName().length() > 5;
        Consumer<Fruit> myStringConsumer = s -> System.out.println(s);
        printNeededFruits(fruits, myStringConsumer);
        Consumer<Fruit> bananaConsumer = fruit -> {
            if (fruit.getName().equals("Banana")){
                System.out.println(fruit);
            }
        };
        Consumer<Fruit> bifFruitConsumer = fruit -> {
            if (fruit.getWeight() > 20){
                System.out.println(fruit);
            }
        };
        printNeededFruits(fruits, bananaConsumer);
        printNeededFruits(fruits, bifFruitConsumer);
        System.out.println(filterFruits(fruits, colorPredicate));
        System.out.println(filterFruits(fruits, weightPredicate));
        System.out.println(filterFruits(fruits, namePredicate));
        System.out.println(filterFruits(fruits, fruit -> fruit.getWeight() > 20 && fruit.getColor().equals("Yellow")));
    }

    private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer){
        for (Fruit fruit: fruits){
            fruitConsumer.accept(fruit);
        }
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (predicate.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }
}
