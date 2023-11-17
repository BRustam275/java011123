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

    public void setName(String name) {
        this.name = name;
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

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public abstract void swim(int length);

    public abstract void run(int length);



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", runLimit=").append(runLimit);
        sb.append(", swimLimit=").append(swimLimit);
        sb.append('}');
        return sb.toString();
    }
}
