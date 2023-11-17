package ru.gb.bagautdinov.homework6;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int count;

    public Dog(String name, int age) {
        super(name, RUN_LIMIT, SWIM_LIMIT, age);
        count++;
    }
    public String toString() {
        return ("Собака по имени " + getName() + ", возрост " + getAge());
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }
}
