package ru.gb.bagautdinov.homework6;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int count;

    public Cat(String name, int age) {
        super(name, RUN_LIMIT, SWIM_LIMIT, age);
        count++;
    }

    public void run(int length) {
        if (length > 0 && length < getRunLimit()) {
            System.out.println(getName() + " Пробежал растояние " + length + " Метров");
        } else {
            System.out.println(getName() + " Не может пробежать " + length + " Метров");
        }
    }

    @Override
    public String toString() {
        return ("Кот " + getName() + " возрост " + getAge());
    }

    public void swim(int length) {
        System.out.println("Коты не умеют плавать ");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }
}
