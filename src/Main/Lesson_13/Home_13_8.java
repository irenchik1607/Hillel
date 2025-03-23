package Main.Lesson_13;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Home_13_8 {
    public static void main(String[] args) {


        //Умова: Об'єднайте два TreeSet у третій TreeSet, зберігаючи унікальність елементів.
        //Приклад: Для TreeSet A = [1, 2, 3] та TreeSet B = [3, 4, 5], очікуваний результат [1, 2, 3, 4, 5].

        Set<Integer> treeSetA = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> treeSetB = new TreeSet<>(Arrays.asList(3, 4, 5, 7, 9, 2, 1, 15, 12));
        System.out.println(createUniqueSet(treeSetA, treeSetB));

    }

    public static TreeSet<Integer> createUniqueSet(Set<Integer> treeSetA, Set<Integer> treeSetB) {
        TreeSet<Integer> newTreeSet = new TreeSet<>();

        newTreeSet.addAll(treeSetA);
        newTreeSet.addAll(treeSetB);

        return newTreeSet;
    }
}
