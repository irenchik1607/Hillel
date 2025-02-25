import java.util.Scanner;

public class HomeWork_8_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевірки входження \"code\": ");
        String line = scanner.nextLine();
        int lineLength = line.length();
        if (lineLength == 0) {
            System.out.println("Рядок не повинен бути порожнім");
        } else {
            System.out.println("Кількість входжень патерну в рядок = " + countCode(line, lineLength));
        }
    }

    public static int countCode(String line, int lineLength) {
        int sumPattern = 0;
        String pattern = "co.e";
        for (int i = 0; i < lineLength - 3; i++) {
            String subLine = line.substring(i, i + 4);
            if (subLine.matches(pattern)){
                sumPattern++;
            };
        }
        return sumPattern;
    }
}
