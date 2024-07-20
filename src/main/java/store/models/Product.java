package store.models;


public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "name = " + name +
                ", price = " + price;
    }
}
