package ru.gb.bagautdinov.homework6;

public abstract class Animal {
    //    1. Создать классы Собака и Кот с наследованием от класса Животное.
//    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//    препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//     dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//    кот не умеет плавать, собака 10 м.).
//    4. * Добавить подсчет созданных котов, собак и животных.
    private String name;
    private int age;
    private int runLimit;
    private int swimLimit;
    private static int count;

    public Animal(String name, int runLimit, int swimLimit, int age) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    //    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
    //    препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//     dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//    кот не умеет плавать, собака 10 м.).
    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public static int getCount() {
        return count;
    }


    public void swim(int length) {
        if (length > 0 && length < getRunLimit()) {
            System.out.println(this + " Пробежал растояние " + length + " Метров");
        }else {
            System.out.println(this + " Не может пробежать " + length + " Метров");
        }
    }

    public void run(int length) {
        if (length > 0 && length < getSwimLimit()){
            System.out.println(this + " Проплыл растояние " + length + " Метров");
        }else {
            System.out.println(this + " Не может проплыть " + length + " Метров");
        }
    }

    @Override
    public String toString() {
        return ("name " + name + ", age " + age +  ", runLimit " + runLimit + ", swimLimit " + swimLimit);
    }
}
