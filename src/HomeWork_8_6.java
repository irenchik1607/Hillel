import java.util.Scanner;

public class HomeWork_8_6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Міша, введи рядок, який будемо дублювати посимвольно:");
        String newLine = scanner.nextLine();
        System.out.println("задубльований рядок: "+ doubleChars(newLine));
    }

    public static String doubleChars (String newLine){
        int lengthLine = newLine.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lengthLine; i++) {
            result.append(newLine.charAt(i));
            result.append(newLine.charAt(i));
        } return result.toString();
    }
}
