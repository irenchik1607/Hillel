import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        //квадрат числа
        System.out.println("Введіть ціле число: ");
        int number = new Scanner(System.in).nextInt();

        int squareNumber = number*number;
        System.out.println("Квадрат числа " + number + " дорівнює " + squareNumber + ".");
        System.out.println("\n");

        //об"єм циліндра
        double cylinderRadius = 3.5;
        double cylinderHeight = 10.0;
        double V = Math.PI*cylinderRadius*cylinderRadius*cylinderHeight;
        System.out.println(V);



    }
}