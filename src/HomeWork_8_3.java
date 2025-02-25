import java.util.Scanner;

public class HomeWork_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи довжину масиву (більше за нуль)");
        int numberOfArray = scanner.nextInt();

        if (numberOfArray <= 0) {
            System.out.println("Повертаю 0, бо числа у масиві відсутні (так сказано в завданні)");
        } else {
            int[] array = new int[numberOfArray];
            for (int i = 0; i < numberOfArray; i++) {
                System.out.println("Введи елемент масиву номер " + (i + 1));
                array[i] = scanner.nextInt();
            }

            System.out.println("Cума чисел у масиві, ігноруючи ділянки чисел, що починаються з 6 і закінчуються на наступному 7, складає: " + sumIgnoreSections(array, numberOfArray));
        }
    }

    public static int sumIgnoreSections ( int[] array, int numberOfArray){
        int sumIgnor = 0;
        for (int i = 0; i < numberOfArray; i++) {
            if (array[i]==6){
                while (i< numberOfArray && array[i]!=7){
                    i++;
                }
            } else {
                sumIgnor=sumIgnor+array[i];
            }
        } return sumIgnor;
    }

}
