package store.services;

import store.exceptions.AmountException;
import store.exceptions.CustomerException;
import store.exceptions.ProductException;
import store.models.Customer;
import store.models.Order;
import store.models.Product;

import java.util.Arrays;


import static store.utils.CreatingArrays.customers;
import static store.utils.CreatingArrays.products;


public class Shopping {
    public static Order buy(Customer customer, Product product, int count) {
        if (!Arrays.asList(customers).contains(customer))
            throw new CustomerException("Unknown customer: " + customer);
        if (!Arrays.asList(products).contains(product))
            throw new ProductException("Unknown product: " + product);
        if (count < 0 || count > 100)
            throw new AmountException("Incorrect amount: " + count);
        return new Order(customer, product, count);
    }
}
