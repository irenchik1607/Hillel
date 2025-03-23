package Main.Lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home_13_5 {
    public static void main(String[] args) {
//        Якщо рядок зустрічається в масиві вдруге, вчетверте, шосте рази і так далі,
//        додайте цей рядок до результату(тільки перше входження). Якщо ж жодний рядок
//        не зустрічається вдруге, поверніть пустий рядок.
//
//        buildResultString(["a", "b", "a"]) → "a”
//        buildResultString(["a", "b", "a", "c", "a", "d", "a"]) → "a”
//        buildResultString(["a", "", "a"]) → "a”

        String[] massive = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(newMassive(massive));
    }

    public static ArrayList<String> newMassive(String[] massive) {
        Map<String, Integer> countOfValues = new HashMap<>();
        ArrayList<String> newArrayList = new ArrayList<String>();

        for (String m : massive) {
            countOfValues.put(m, countOfValues.getOrDefault(m, 0) + 1);

            if (countOfValues.get(m) % 2 == 0 && !newArrayList.contains(m)) {

                newArrayList.add(m);

            }
        }
        return newArrayList;

    }


}
