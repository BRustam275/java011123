package ru.gb.bagautdinov.homework6;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;
    private static int count;

    public Cat(String name, int age) {
        super(name, RUN_LIMIT, SWIM_LIMIT, age);
        count++;
    }
    public void swim(int length) {
        System.out.println(" Кот не умеют плавать ");

    }

    public String toString() {
        return ("Кот по имени " + getName() + ", возрост " + getAge());
    }
}
