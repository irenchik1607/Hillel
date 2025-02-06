import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        //квадрат числа
        System.out.println("Введіть ціле число: ");
        int number = new Scanner(System.in).nextInt();
        int squareNumber = number*number;
        System.out.println("1) Квадрат числа " + number + " дорівнює " + squareNumber + ".\n");

        //об"єм циліндра
        double cylinderRadius = 3.5;
        double cylinderHeight = 10.0;
        double V = Math.PI*cylinderRadius*cylinderRadius*cylinderHeight;
        System.out.println("2) Об'єм циліндра з радіусом " + cylinderRadius + " і висотою " + cylinderHeight + " дорівнює "  + V + ".\n");

        //число в ступені
        System.out.println("3) Введіть число а: ");
        int mainNumber = new Scanner(System.in).nextInt();
        System.out.println("   Введіть число b: ");
        int powerOfNumber = new Scanner(System.in).nextInt();
        long result = (long)Math.pow(mainNumber, powerOfNumber);
        System.out.println("   Результат " + mainNumber + "^" + powerOfNumber + " дорівнює "  + result + ".");
    }
}