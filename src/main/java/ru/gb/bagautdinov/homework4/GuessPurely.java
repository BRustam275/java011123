package ru.gb.bagautdinov.homework4;

import java.util.Random;
import java.util.Scanner;

public class GuessPurely {
    static final int SIZE = 10;
    static final int USER_ATTEMPTS = 3;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
/* Написать программу, которая загадывает случайное число от 0 до 9 и пользователю
        дается 3 попытки угадать число. При каждой попытке компю должен сообщить, больше ли указанное
        пользователем число, чем загаданное, или меньше. после победы или поражения выводится вопрос -
        "Повторить игру еще раз? 1 - да /  нет"         */
    public static void main(String[] args) {
        guessTheNumber();

    }
    /**
     * Реализованна логика задачи.
     */
    public static void guessTheNumber() {
        do {
            int computerGuessingNumber = random.nextInt(SIZE);
            System.out.println("Компютер загадал число от 0 до 9. Угадайте с трех попыток");

            int move = USER_ATTEMPTS;
            while (move > 0) {
                System.out.println("Осталось попыток " + move);
                if (isNotInt())
                    continue;
                int input = scanner.nextInt();
                if (isNotValidInt(input))
                    continue;

                if (computerGuessingNumber < input) {
                    System.out.println("Загаданное число меньше");
                }
                if (computerGuessingNumber > input) {
                    System.out.println("Загаданное число больше");
                }
                if (computerGuessingNumber == input) {
                    System.out.println("Поздравляю!!! Вы угадали.");
                    break;
                }
                move--;

                if (move == 0 && computerGuessingNumber != input) {
                    System.out.println("Вы проиграли... Компютер загадал число " + computerGuessingNumber);
                }
            }
            System.out.println(" «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");

        } while (scanner.next().equals("1"));
        {
            scanner.close();
        }
    }

    /**
     * Проверка на коректность ввода числа в заданном диапазоне.
     *
     * @param input введнное значение.
     * @return возвращаемое значение.
     */
    private static boolean isNotValidInt(int input) {
        if (input < 0 || input > 9) {
            System.out.println("Число должно быть от 0 до 9, попробуте еще раз");
            return true;
        }
        return false;
    }

    /**
     * Проверка введено ли число или нет.
     *
     * @return возвращаемое значение.
     */
    private static boolean isNotInt() {
        if (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.println("Вы должны ввести целое чистою попробуйте снова");
            return true;
        }
        return false;
    }
}
