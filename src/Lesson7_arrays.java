
import java.util.Scanner;

public class Lesson7_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }

        // Обчислення середнього значення елементів в масиві чисел
        System.out.println("Середнє значення елементів в масиві чисел: " + averageValue(array) + ".\n");

        // Виведення макс і мін значень елементів масиву
        System.out.println("Максимальне значення серед елементів в масиві - " + maxValue(array) + ", а мінімальне - " + minValue(array) + ".\n");

        // Виведення елементів масиву в зворотньому порядку.
        viceVersa(array);

        //Перевірка наявності числа в масиві

    }

    // Обчислення середнього значення елементів в масиві чисел
    static double averageValue(int[] array) {
        int sum = 0;
        double result;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        result = sum / array.length;
        return result;
    }


    // Максимальне значення серед елементів в масиві чисел
    static int maxValue(int[] array) {
        int maxResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxResult < array[i]) {
                maxResult = array[i];
            }
        }
        return maxResult;
    }


    // Мінімальне значення серед елементів в масиві чисел
    static int minValue(int[] array) {
        int minResult = 0;
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