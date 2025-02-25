import java.util.Scanner;

public class HomeWork_8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи перший рядок");
        String firstLine = scanner.nextLine();
        System.out.println("А тепер давай другий введемо");
        String secondLine = scanner.nextLine();

        int firstLineLength = firstLine.length();
        int secondLineLength = secondLine.length();

        if (firstLineLength == 0 || secondLineLength == 0) {
            System.out.println("Міша, у нас проблемки, бо ти десь полишив порожній рядок");
        } else {
            System.out.println("Давай подивимось, чи є один рядок закінченням іншого: " + endsWith(firstLine, secondLine, firstLineLength, secondLineLength));
        }
    }

    public static boolean endsWith(String firstLine, String secondLine, int firstLineLength, int secondLineLength) {
        String subString = new String();
        int result = 0;
        if (firstLineLength <= secondLineLength) {
            subString = secondLine.substring((secondLineLength - firstLineLength));
            result = firstLine.compareToIgnoreCase(subString);

        } else {
            subString = firstLine.substring((firstLineLength - secondLineLength));
            result = secondLine.compareToIgnoreCase(subString);
        }return(result==0);
    }
}
