import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Міша, обери задачу, рішення якої ти хотів би отримати. Можливі варіанти: 1, 2, 3, 4 або 5 :)");
        int taskNumber = new Scanner(System.in).nextInt();

        switch (taskNumber) {
            case 1:
                System.out.println("Будь ласка, вкажіть свій вік (повні роки):");
                int age = new Scanner(System.in).nextInt();
                System.out.println(checkAge(age));
                break;
            case 2:
                System.out.println("Введіть, будь ласка, ціле число");
                int squareOfNumber = new Scanner(System.in).nextInt();
                System.out.println(isPerfectSquare(squareOfNumber));
                break;
            case 3:
                System.out.println("Введіть, будь ласка, ціле число");
                int number = new Scanner(System.in).nextInt();
                System.out.println(calculateSumUpToN(number));
                break;
            case 4:
                System.out.println("Введіть, будь ласка, бал студента від 1 до 5 включно");
                int mark = new Scanner(System.in).nextInt();
                System.out.println(getGrade(mark));
                break;
            case 5:
                System.out.println("Введіть, будь ласка, число, щоб перевірити чи є воно простим:");
                int primeNumber = new Scanner(System.in).nextInt();
                System.out.println(isPrime(primeNumber));
                break;
            default:
                System.out.println("Міша, обери номер задачі із запропонованих!");
        }
    }

    // Чи ти дорослий? (задача 1)
    static String checkAge(int age) {

        if (0 <= age && age < 18) {
            return "Ви не є дорослою особою";
        } else if (18 <= age && age <= 125) {  // Найдовше задокументоване життя людини: Жанна Кальман (Jeanne Calment, Франція) – 122 роки 164 дні (1875–1997).
            return "Ви доросла особа";
        } else {
            return "Ви ввели некоректний вік";
        }

    }

    // Квадрат числа (задача 2)
    static String isPerfectSquare(int squareOfNumber) {

        for (int i = 1; i <= squareOfNumber; i++) {
            if (i * i == squareOfNumber)
                return "true";
        }
        return "false";

    }

    // Числовий ряд (задача 3)
    static String calculateSumUpToN(int number) {
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }
            return String.valueOf(sum);
        } else {
            return "Хибні вхідні параметри";
        }
    }

    // Оцінка студента (задача 4)
    static String getGrade(int grade) {

        switch (grade) {
            case 1:
                return "Погано. Пора викликати батьків :)";
            case 2:
                return "Нижче за середній бал";
            case 3:
                return "Середній бал";
            case 4:
                return "Добре";
            case 5:
                return "Відмінно";
            default:
                return "Неправильна оцінка";
        }

    }

    // Просте число (задача 5)
    static String isPrime(int primeNumber) {
        if (primeNumber <= 1) {
            return "false";
        }

        int remainderFromDivision;
        int sumOfReminder = 0;
        for (int i = 1; i <= primeNumber; i++) {
            remainderFromDivision = primeNumber % i;
            if (remainderFromDivision == 0) {
                sumOfReminder ++;
            }
        }

        if (sumOfReminder==2) {
               return "true";
              } else {
            return "false";
        }
    }


}
