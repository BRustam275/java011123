package ru.gb.bagautdinov.homework5;

public class Employee {
    //        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
//        консоль.
//        4. Создать массив из 5 сотрудников.
//                Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
//                30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//...
//        persArray[4] = new Person(...);
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    Employee(String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        setAge(age);
    }

    public void info() {
        System.out.println("Имя пользователя: " + name + ", Должность:  " + position + ", email: " + email + ", телефон: " + telephone + ", зарплата: " + salary + ", возрост: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
