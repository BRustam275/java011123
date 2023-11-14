package ru.gb.bagautdinov.homework4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        String randomWord = words[random.nextInt(words.length)];
  //      System.out.println(randomWord);
        System.out.println(" Угадай слово : ");
        String word = scanner.next().toLowerCase();
        int hintCharacter = 1;
        while (!randomWord.equals(word)){
            StringBuilder stringBuilder = new StringBuilder (randomWord.substring(0, hintCharacter));
            System.out.println(stringBuilder.append("###############"));
            System.out.println("Попробуйте еще раз! ");
            word = scanner.next().toLowerCase();
            if (hintCharacter + 1 <= randomWord.length()) {
                hintCharacter += 1;
            }
        }
        if (randomWord.equals(word)){
            System.out.println("Правильно! Ты выиграл!!!");

       }
    }

}
