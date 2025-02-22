import java.util.Scanner;

public class Lection6_strings {
    public static void main() {


        Scanner scanner = new Scanner(System.in);

        //ДЗ 7.1. Рядок, створений з n повторень останніх n символів
        System.out.println("Введи строку");
        String word = scanner.nextLine();
        int length = word.length();
        if (length == 0) {
            System.out.println("Міша, ти не ввів строку");
        } else {
            System.out.println("Введіть значення від 1 до " + length);
            int number = scanner.nextInt();
            System.out.println(subWordMethod(number, length, word));
        }
    }

    //ДЗ 7.1. Рядок, створений з n повторень останніх n символів
    static String subWordMethod(int number, int length, String word) {
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
}
