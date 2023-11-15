package ru.gb.bagautdinov.homework5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "manager", "@mail.ru", "89279586352", 52000, 42);
        employees[1] = new Employee("Andrey", "manager", "@mail.ru", "89279586353", 45000, 34);
        employees[2] = new Employee("Aleks", "manager", "@mail.ru", "89279586355", 55000, 25);
        employees[3] = new Employee("Vasilii", "manager", "@mail.ru", "89279586356", 50000, 29);
        employees[4] = new Employee("Leo", "manager", "@mail.ru", "89279586358", 60000, 48);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }

        }


    }
}
