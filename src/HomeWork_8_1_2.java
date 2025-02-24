import java.util.Scanner;

public class HomeWork_8_1_2 {
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

            System.out.println("Кількість парних чисел у масиві дорівнює " + countEvenInts(array, numberOfArray));
        }
    }

    public static int countEvenInts(int[] array, int numberOfArray) {
        int countNumber = 0;
        for (int i = 0; i < numberOfArray; i++) {
            if (array[i] % 2 == 0) {
                countNumber++;
            }
        }
        return countNumber;
    }
}
