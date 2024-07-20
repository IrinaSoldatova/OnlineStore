package store.models;

import store.enums.Genders;

import java.time.LocalDate;

public class Employee extends Customer {
    private final String position;
    private final int salary;

    public Employee(String lastName, String firstName, String middleName, LocalDate dateOfBirth, String phoneNumber, Genders gender, String position, int salary) {
        super(lastName, firstName, middleName, dateOfBirth, phoneNumber, gender);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Last name = " + getLastName() +
                ", First name = " + getFirstName() +
                ", Middle name = " + getMiddleName() +
                ", Position = " + position +
                ", Phone number = " + getPhoneNumber() +
                ", salary = " + salary +
                ", Age = " + getAge() +
                ", gender = " + gender;
    }
}
