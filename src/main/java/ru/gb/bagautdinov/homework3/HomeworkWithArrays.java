package ru.gb.bagautdinov.homework3;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class HomeworkWithArrays {
    public static void main(String[] args) {
        replacingNumbers(new int[10]);
        fillTheArray (new int [100]);
        multiplyByTwo(new  int[10]);
        System.out.println(Arrays.deepToString(diagonalReplacement(5)));
        System.out.println(Arrays.toString(receivesAndTransmits(10, 5)));
        System.out.println(min(new int[]{1, 9, 14, 5, 7, 96}));
        boolean b = checkBalance(new int[]{1, 5, 4, 8, 1, 7, 3});

    }


    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
//0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replacingNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(2);
        }
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Замененный массив: \n" + Arrays.toString(arr));

    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillTheArray (int [] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//умножить на 2;
    public static void multiplyByTwo(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = new Random().nextInt(10);
        }
        System.out.println("Первоночальный массив: \n" + Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) {
                b[i] *= 2;
            }
        }
        System.out.println("Замененный массив: \n" + Arrays.toString(b));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//[1][1], [2][2], …, [n][n];
    public static int[][] diagonalReplacement(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;

        }
        return matrix;
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] receivesAndTransmits(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;

    }


    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static int min(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int j : a) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        return min;
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
//массива равны.
//Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//граница показана символами |||, эти символы в массив не входят и не имеют никакого
//отношения к ИЛИ.
    public static boolean checkBalance(int[] a) {
        int leftSum = 0;
        for (int k : a) {
            int rightSum = 0;
            leftSum += k;
            for (int i : a) {
                rightSum += i;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

//8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
//положительным, или отрицательным), при этом метод должен сместить все элементы массива
//на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
//вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
//6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
//выбирать сами.
}
