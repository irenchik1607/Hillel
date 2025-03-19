package Lesson_13;

import java.util.*;

public class Home_13_7 {
    public static void main(String[] args) {
        //Приклад: Для LinkedHashSet A = [1, 2, 3, 4] та LinkedHashSet B = [3, 5, 6], очікуваний результат true.
        //Треба визначити, чи є спільні елементи в двох множинах.

        Set<Integer> A = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 7));
        Set<Integer> B = new LinkedHashSet<>(Arrays.asList(3, 5, 6));
        System.out.println(presenceOfCommonElements(A, B));
    }

    public static boolean presenceOfCommonElements(Set<Integer> A, Set<Integer> B) {
        List<Integer> A1 = new ArrayList<>(A);
        List<Integer> B1 = new ArrayList<>(B);

        boolean result = false;
        for (int i = 0; i < A1.size(); i++) {
            if (B1.contains(A1.get(i))) {
                result = true;
            }
        }
        return result;
    }
}
