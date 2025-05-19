package java.Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class Home_13_3 {
    public static void main(String[] args) {

//        Це класичний алгоритм підрахунку слів: задано масив рядків, повернути Map<String, Integer>
//        з ключем для кожного різного рядка та значенням - кількістю разів, як цей рядок зустрічається в масиві.

        String [] massive={"one","second","rule","second","second", "rule"};
        System.out.println(countWords(massive));

    }

    public static Map<String, Integer> countWords (String [] massive){
        Map<String, Integer> newMap = new HashMap<>();
        for (String m: massive){
            newMap.put(m, newMap.getOrDefault(m, 0) + 1);
        } return newMap;
        }
}
