
import java.util.Scanner;

public class Lesson7_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи кількість елементів масиву");
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи елемент масиву номер "+ (i+1));
            array[i] = scanner.nextInt();
        }

        //Перевірка наявності числа в масиві
        System.out.println();
        System.out.println("Введи ціле число для перевірки його значення у масиві");
        int squareOfNumber = scanner.nextInt();
        if (numberOfArray(array, squareOfNumber)) {
            System.out.println("Число " + squareOfNumber + " є в масиві" + ".\n");
        } else {
            System.out.println("Число " + squareOfNumber + " відсутнє в масиві" + ".\n");
        }


        // Обчислення середнього значення елементів в масиві чисел
        System.out.println("Середнє значення елементів в масиві чисел: " + averageValue(array) + ".\n");

        // Виведення макс і мін значень елементів масиву
        System.out.println("Максимальне значення серед елементів в масиві - " + maxValue(array) + ", а мінімальне - " + minValue(array) + ".\n");

        // Виведення елементів масиву в зворотньому порядку.
        viceVersa(array);
        System.out.println(".\n");

    }

    //Перевірка наявності числа в масиві
    static boolean numberOfArray(int[] array, int squareOfNumber) {

        for (int i = 0; i < array.length; i++) {
            if (squareOfNumber == array[i]) {
                return true;
            }
        }
        return false;
    }

    // Обчислення середнього значення елементів в масиві чисел
    static double averageValue(int[] array) {
        double sum = 0;
        double result;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        result = sum / array.length;
        return result;
    }


    // Максимальне значення серед елементів в масиві чисел
    static int maxValue(int[] array) {
        int maxResult = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxResult < array[i]) {
                maxResult = array[i];
            }
        }
        return maxResult;
    }


    // Мінімальне значення серед елементів в масиві чисел
    static int minValue(int[] array) {
        int minResult = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minResult > array[i]) {
                minResult = array[i];
            }
        }
        return minResult;
    }


    // Виведення елементів масиву в зворотньому порядку.
    static int[] viceVersa(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

}
