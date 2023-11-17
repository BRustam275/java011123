package ru.gb.bagautdinov.homework6;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Барсик", 5),
                new Cat("Мурзик", 2),
                new Dog("Боб", 4),
                new Dog("Пират", 2)};
        for (Animal animal : animals) {
            animal.run(350);
            animal.swim(25);
            System.out.println(animal);
        }
        System.out.println("Количество живоныж " + Animal.getCount());
        System.out.println("Количество кошек " + Cat.getCount());
        System.out.println("Количество собак " + Dog.getCount());

    }
}
