package tms.karpovich.lesson16Stream;

import java.util.List;
import java.util.stream.Stream;

public class Order {
    private int id;
    private List<Product> products;
    public Stream<Product> getProductStream(){
        return products.stream();
    }

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
