import java.util.Scanner;

public class HomeWork_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи рядок:");
        String catDogLine = scanner.nextLine();
        System.out.println(catDog(catDogLine));
    }

    public static boolean catDog(String catDogLine) {
        int catDogLength = catDogLine.length();
        String catPattern = "cat";
        String dogPattern = "dog";
        int countCat = 0;
        int countDog = 0;

        if (catDogLine.contains("cat") || catDogLine.contains("dog")) {
            for (int i = 0; i <= catDogLength - 3; i++) {
                if (catDogLine.substring(i, i + 3).equals(catPattern)) {
                    countCat++;
                }
                if (catDogLine.substring(i, i + 3).equals(dogPattern)) {
                    countDog++;
                }
            }
        } else {
            return false;
        }

        return countCat == countDog;

    }
}
