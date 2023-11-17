package ru.gb.bagautdinov.homework6;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int count;

    public Dog(String name, int age) {
        super(name, RUN_LIMIT, SWIM_LIMIT, age);
        count++;
    }

    @Override
    public void swim(int length) {
        if (length > 0 && length < getRunLimit()) {
            System.out.println(getName() + " Пробежал растояние " + length + " Метров");
        }else {
            System.out.println(getName() + " Не может пробежать " + length + " Метров");
        }
    }

    @Override
    public void run(int length) {
        if (length > 0 && length < getSwimLimit()){
            System.out.println(getName() + " Проплыл растояние " + length + " Метров");
        }else {
            System.out.println(getName() + " Не может проплыть " + length + " Метров");
        }
    }

    @Override
    public String toString() {
        return ("Собака " + getName() + " Возрост " + getAge());
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }
}
