package ru.gb.bagautdinov.homework2;

public class FirstHomework {
    public static void main(String[] args) {
        System.out.println(checkingTwoNumbers(10, 6));
        isTheNumberPositive(5);
        System.out.println(isNegative(5));
        outputALineToTheConsole("auto", 5);
        System.out.println(leapYear(5));
    }

    //  1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //  в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkingTwoNumbers(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }

      //  2. Написать метод, которому в качестве параметра передается целое число, метод должен
      //  напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
      //  считаем положительным числом.
    public static void isTheNumberPositive (int a){
        if (a >= 0){
            System.out.println("Положительное число");
        }else {
            System.out.println("Отрицательнок число");
        }

    }
      //  3. Написать метод, которому в качестве параметра передается целое число. Метод должен
      //  вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int num){
        return num < 0;
    }
      //  4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
      //  отпечатать в консоль указанную строку, указанное количество раз;

    public static void outputALineToTheConsole(String text, int c){
        for (int i = 0; i < c; i++) {
            System.out.println(text);
        }

    }
      //  5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
      //  (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
      //  100-го, при этом каждый 400-й – високосный.
    public static boolean leapYear (int year){
        return year % 4 == 0 || year % 100 != 0 || year % 400 == 0;
    }


}
