package store.utils;

import store.models.Customer;
import store.models.Employee;
import store.enums.Genders;
import store.models.Product;

import java.time.LocalDate;

public class CreatingArrays {
    public static final Customer[] customers = {
            new Customer("Ivanov", "Ivan", "Ivanovich",
                    LocalDate.parse("1998-07-04"), "+79991111111", Genders.MALE),
            new Customer("Ivanova", "Maria", "Petrovna",
                    LocalDate.parse("1988-05-23"), "+79992222222", Genders.FEMALE),
            new Customer("Petrov", "Pavel", "Petrovich",
                    LocalDate.parse("1994-11-04"), "+79993333333", Genders.MALE),
            new Customer("Smirnov", "Anton", "Pavlovich",
                    LocalDate.parse("1987-09-11"), "+79994444444", Genders.MALE)
    };

    public static final Product[] products = {
            new Product("Bag", 5000.00),
            new Product("Phone", 50000.00),
            new Product("Laptop", 80000.00),
            new Product("TV", 35000.00)
    };

    public static final Employee[] employees = {
            new Employee("Ivanova", "Ekaterina", "Ivanovna",
                    LocalDate.parse("1998-07-04"), "+79991234567",
                     Genders.FEMALE, "manager",85000),
            new Employee("Ivanova", "Maria", "Petrovna",
                    LocalDate.parse("1988-05-23"),"+79993456789",
                     Genders.FEMALE, "programmer", 180000),
            new Employee("Petrov", "Pavel", "Victorovich",
                    LocalDate.parse("1994-11-04"), "+79998765432",
                    Genders.MALE, "tester", 120000),
            new Employee("Smirnov", "Nicolay", "Ivanovich",
                    LocalDate.parse("1987-09-11"), "+79990000000",
                     Genders.MALE, "team lead",250000)
    };
}
