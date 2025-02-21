import java.util.Scanner;

public class Lection6_strings {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String word = "Hello";
        int length = word.length();
        System.out.println("Введіть значення від 1 до " + length);
        int number = scanner.nextInt();
       // System.out.println(subWordMethod(number, length, word));
    }

    static String subWordMethod(int number, int length, String word) {
        String subWord = new String();
        if (number >= 1 && number <= length) {

            for (int i = 1; i <= number; i++) {
                subWord = word.substring(length-number);
           System.out.println(subWord);
            }
        } else {
            System.out.println("Міша, ти вводиш некоректне значення");
        }
        return subWord;
    }
}
