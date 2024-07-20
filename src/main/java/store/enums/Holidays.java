package store.enums;

import store.models.Employee;

import java.time.LocalDate;

public enum Holidays {
    NEW_YEAR(LocalDate.of(LocalDate.now().getYear(), 1, 1)),
    MARCH_8(LocalDate.of(LocalDate.now().getYear(), 3, 8)),
    FEB_23(LocalDate.of(LocalDate.now().getYear(), 2, 23));

    private final LocalDate date;

    Holidays(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public static void congratulateEmployees(Employee[] employees) {
        LocalDate today = LocalDate.now();
        boolean isHoliday = false;

        for (Employee employee : employees) {
            for (Holidays holiday : Holidays.values()) {
                if (today.equals(holiday.getDate())) {
                    isHoliday = true;
                    switch (holiday) {
                        case NEW_YEAR:
                            System.out.println(employee.getFirstName() + ", Happy New Year!");
                            break;
                        case MARCH_8:
                            if (employee.getGender() == Genders.FEMALE)
                                System.out.println(employee.getFirstName() + ", Happy March 8th!");
                            break;
                        case FEB_23:
                            if (employee.getGender() == Genders.MALE)
                                System.out.println(employee.getFirstName() + ", Happy February 23rd!");
                            break;
                    }
                }
            }
            if (!isHoliday) {
                System.out.println(employee.getFirstName() + ", Have a good day!");
            }
        }
    }
}
