package store.models;

import store.enums.Genders;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate dateOfBirth;
    private final String phoneNumber;
    Genders gender;

    public Customer(String lastName, String firstName,
                    String middleName, LocalDate dateOfBirth, String phoneNumber, Genders gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Last name = " + lastName +
                ", First name = " + firstName +
                ", Middle name = " + middleName +
                ", Age = " + getAge() +
                ", Phone number = " + phoneNumber +
                ", Gender = " + gender;

    }
}
