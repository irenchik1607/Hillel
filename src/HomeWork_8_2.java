import java.util.Scanner;

public class HomeWork_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи довжину масиву (більше за 2), бо не працюватиме конструкція");
        int numberOfArray = scanner.nextInt();

        if (numberOfArray <= 2) {
            System.out.println("Міша,ти промахнувся))) Нада не менше трьох");
        } else {
            int[] array = new int[numberOfArray];
            for (int i = 0; i < numberOfArray; i++) {
                System.out.println("Введи елемент масиву номер " + (i + 1));
                array[i] = scanner.nextInt();
            }

            System.out.println("Оте середнє значення складає " + centeredAverage(array, numberOfArray));
        }
    }

    public static int centeredAverage(int[] array, int numberOfArray) {
        int minElement = array[0];
        int maxElement = array[0];
        int result;
        int sumOfArray = 0;
        for (int i = 0; i < numberOfArray; i++) {
            sumOfArray = sumOfArray + array[i];
            if (minElement > array[i]) {
                minElement = array[i];
            }
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return result = (sumOfArray - minElement - maxElement) / (numberOfArray - 2);

    }
}
