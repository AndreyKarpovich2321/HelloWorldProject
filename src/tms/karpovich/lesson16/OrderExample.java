package tms.karpovich.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderExample {
    public static void main(String[] args) {
        List<Product> firstProducts = Arrays.asList(new Product("Milk", 20), new Product("Eggs", 15), new Product("Sugar", 10));
        List<Product> secondProducts = Arrays.asList(new Product("Bread", 20), new Product("Eggs", 15), new Product("Apples", 10));
        List<Product> thirdProducts = Arrays.asList(new Product("Honey", 20), new Product("Eggs", 15), new Product("Sushi", 10));
        List<Order> orders = Arrays.asList(new Order(1, firstProducts), new Order(2, secondProducts), new Order(3, secondProducts));
        var result = orders.stream()
                .filter(isOrderWithEggs())
                .collect(Collectors.toList());
        System.out.println(result);

        var products = orders.stream().flatMap(Order::getProductStream).distinct().map(Product::getProductName).toList();
        System.out.println(products);
    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order.getProducts().stream().anyMatch(getEggs());
    }

    private static Predicate<Product> getEggs() {
        return product -> product.getProductName().equals("Eggs");
    }
}
