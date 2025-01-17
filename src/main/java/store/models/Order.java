package store.models;

public class Order {
    Customer customer;
    Product product;
    private final int amount;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", product=" + product +
                ", amount=" + amount +
                '}';
    }

}
