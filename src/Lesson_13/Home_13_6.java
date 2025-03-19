package Lesson_13;

import java.util.*;

public class Home_13_6 {
    public static void main(String[] args) {
        //Приклад: Для списку [3, 1, 2, 2, 1, 2, 3, 3, 3],
        // очікуваний результат 3, оскільки він зустрічається найбільшу кількість разів.

        List<Integer> massive = Arrays.asList(3, 1, 2, 2, 1, 2, 3, 3, 3);
        System.out.println(findNeededValue(massive));
    }

    public static int findNeededValue(List<Integer> massive) {
        Map<Integer, Integer> newMassive = new HashMap<>();
        int value = 0;
        int neededKey = 0;
        for (Integer m : massive) {
            newMassive.put(m, newMassive.getOrDefault(m, 0) + 1);

            int size = newMassive.size();
            for (int i = 0; i < size; i++) {
                if (value < newMassive.get(m)) {
                    value = newMassive.get(m);
                }
            }

            Set<Map.Entry<Integer, Integer>> entries = newMassive.entrySet();
            for (Map.Entry<Integer, Integer> element : entries) {
                if (element.getValue() == value) {
                    neededKey = element.getKey();
                }
            }

        }
        return neededKey;

    }

}
