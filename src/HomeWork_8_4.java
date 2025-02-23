import java.util.Scanner;

public class HomeWork_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Міша, введи кількість елементів масиву:");
        int arrayElement = scanner.nextInt();
        int[] array = new int[arrayElement];
        for (int i = 0; i < arrayElement; i++) {
            System.out.println("Введи елемент масиву номер " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("сума елементів масиву (за виключенням числа 13 та слідуючих за ним, якщо такі є) складає: " + sumWithoutUnlucky13(array, arrayElement));
    }

    public static int sumWithoutUnlucky13(int[] array, int arrayElement) {
        int sumOfElements = 0;
        for (int i = 0; i < arrayElement; i++) {
            if (array[i] != 13) {
                sumOfElements = sumOfElements + array[i];
            } else if (array[i] == 13) {
                break;
            }
        }
        return sumOfElements;
    }


}
