import java.util.Scanner;

public class HomeWork_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи довжину масиву (більше за нуль)");
        int numberOfArray = scanner.nextInt();

        if (numberOfArray <= 0) {
            System.out.println("Міша, масив не повинен бути порожнім");
        } else {
            int[] array = new int[numberOfArray];
            for (int i = 0; i < numberOfArray; i++) {
                System.out.println("Введи елемент масиву номер " + (i + 1));
                array[i] = scanner.nextInt();
            }

            System.out.println("Різниця між найбільшим і найменшим значеннями у масиві складає " + differenceLargestSmallest(array, numberOfArray));
        }
    }


    public static int differenceLargestSmallest(int[] array, int numberOfArray) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 0; i < numberOfArray; i++) {
            minValue = Math.min(minValue, array[i]);
            maxValue = Math.max(maxValue, array[i]);
        }
        return (maxValue - minValue);
    }
}
