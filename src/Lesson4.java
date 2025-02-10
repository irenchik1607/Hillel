import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        //квадрат числа
        System.out.println("Введіть ціле число: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("1) Квадрат числа " + number + " дорівнює " + squareNumber(number) + ".\n");

        //об"єм циліндра
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        System.out.println("2) Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume(radius,height) + ".\n");

        //число в ступені
        System.out.println("3) Введіть число а: ");
        int mainNumber = new Scanner(System.in).nextInt();
        System.out.println("   Введіть число b: ");
        int powerOfNumber = new Scanner(System.in).nextInt();
        System.out.println("   Результат " + mainNumber + "^" + powerOfNumber + " дорівнює "  + calculation (mainNumber, powerOfNumber) + ".");

    }


    static int squareNumber(int number){
        int result= number*number;
        return result;
    }

    static double volume(double cylinderRadius, double cylinderHeight){
        double cylinderVolume = Math.PI*cylinderRadius*cylinderRadius*cylinderHeight;
        return cylinderVolume;
    }

    static int calculation (int mainNumber, int powerOfNumber){
        int result = (int)Math.pow(mainNumber, powerOfNumber);
        return result;
    }
    
}