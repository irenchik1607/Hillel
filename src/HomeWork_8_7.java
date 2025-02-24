import java.util.Scanner;

public class HomeWork_8_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Міша, введи рядок, щоб перевірити скільки в ньому патернів hi:");
        String hiLine = scanner.nextLine();
        System.out.println(countHi(hiLine));
    }

    public static int countHi(String hiLine) {
        int hiLength = hiLine.length();
        String pattern = "hi";
        int countHi = 0;
        for (int i = 0; i < (hiLength - 1); i++) {
            if (hiLine.substring(i, i + 2).equals(pattern)) {
                countHi++;
            }
        }
        return countHi;
    }
}