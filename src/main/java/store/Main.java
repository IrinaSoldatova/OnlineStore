package store;



import store.exceptions.AmountException;
import store.exceptions.CustomerException;
import store.exceptions.ProductException;
import store.models.Customer;
import store.enums.Genders;
import store.models.Order;
import store.models.Product;
import store.services.Shopping;

import java.time.LocalDate;

import static store.enums.Holidays.congratulateEmployees;
import static store.utils.CreatingArrays.*;


public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[5];

        orders[0] = new Order(customers[0], products[0], 1);
        orders[1] = new Order(customers[3], products[2], -1);
        orders[2] = new Order(customers[2], products[1], 150);
        orders[3] = new Order(customers[1], new Product("Car", 3_500_000.00), 1);
        orders[4] = new Order(new Customer("Sidorov", "Kirill", "Viktorovich",
                LocalDate.parse("1990-01-01"), "+79995555555", Genders.MALE), products[3], 1);

        int totalOrders = 0;
        for (int i = 0; i < orders.length; i++) {
            try {
                Order purchasedOrder = Shopping.buy(orders[i].getCustomer(), orders[i].getProduct(), orders[i].getAmount());
                orders[i] = purchasedOrder;
                totalOrders++;
            } catch (ProductException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (CustomerException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            } catch (AmountException e) {
                System.out.println("Error: " + e.getMessage());
                orders[i] = Shopping.buy(orders[i].getCustomer(), orders[i].getProduct(), 1);
                totalOrders++;
            }
        }

        System.out.println("Total purchases made: " + totalOrders);

            System.out.println();
            congratulateEmployees(employees);

    }
}
