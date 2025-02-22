import java.util.Scanner;


public class Lection6_strings {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //ДЗ 7.1. Рядок, створений з n повторень останніх n символів
        System.out.println("Введи рядок");
        String word = scanner.nextLine();
        int length = word.length();
        if (length == 0) {
            System.out.println("Міша, ти не ввів рядок");
        } else {
            System.out.println("Введіть значення від 1 до " + length);
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println(subWordMethod(number, length, word));
        }

        //ДЗ 7.2. Заміксуємо рядки
        System.out.println("Введи перший рядок");
        String firstLine = scanner.nextLine();
        System.out.println("Введи другий рядок");
        String secondLine = scanner.nextLine();
        System.out.println(mixLine(firstLine, secondLine));

        //ДЗ 7.3. Xyz у середині рядка
        System.out.println("Введи рядок, що перевіримо на наявність xyz");
        String stringLine = scanner.nextLine();
        System.out.println(chekerXyz(stringLine));

    }


    //ДЗ 7.1. Рядок, створений з n повторень останніх n символів
    public static String subWordMethod(int number, int length, String word) {
        String subWord = new String();
        if (number >= 1 && number <= length) {

            for (int i = 1; i <= number; i++) {
                subWord = word.substring(length - number).repeat(number);
            }
            return subWord;
        } else {
            return "Міша, ти вводиш некоректне значення";
        }
    }


    //ДЗ 7.2. Заміксуємо рядки
    public static String mixLine(String firstLine, String secondLine) {
        StringBuilder newLine = new StringBuilder();
        int lengthFirstLine = firstLine.length();
        int lengthSecondLine = secondLine.length();

        int minLength;
        if (lengthFirstLine < lengthSecondLine) {
            minLength = lengthFirstLine;
        } else {
            minLength = lengthSecondLine;
        }

        for (int i = 0; i < minLength; i++) {
            newLine.append(firstLine.charAt(i)).append(secondLine.charAt(i));
        }

        if (lengthFirstLine > minLength) {
            firstLine = firstLine.substring(minLength);
            newLine.append(firstLine);
        }
        if (lengthSecondLine > minLength) {
            secondLine = secondLine.substring(minLength);
            newLine.append(secondLine);
        }

        return newLine.toString();
    }

    //ДЗ 7.3. Xyz у середині рядка
    public static boolean chekerXyz(String stringLine) {
        int lengthXyz = stringLine.length();
        if (stringLine.contains("xyz")) {
            int indexXyz = stringLine.indexOf("xyz");
            int postixXyz = lengthXyz - (indexXyz + 3);

            if (indexXyz == postixXyz || (indexXyz - 1) == postixXyz || (indexXyz + 1) == postixXyz) {
                return true;
            } else
                return false;
        }
        return false;

    }

}





