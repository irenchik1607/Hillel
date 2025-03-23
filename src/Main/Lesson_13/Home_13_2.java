package Main.Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class Home_13_2 {
    public static void main(String[] args) {
       // Завдання полягає в тому, щоб створити і повернути Map<String, String>,
        // де ключами будуть перші символи кожного рядка з непорожнього масиву String[],
        // а значеннями будуть останні символи відповідних рядків.
        String[] words = {"один", "Два", "three4", " "};

        System.out.println(mapFromWords(words));

    }

    public static Map<String, String> mapFromWords (String[] words){
        Map<String, String> newMap = new HashMap<>();

        for (String w: words){

            if (!w.trim().isEmpty()) {
                newMap.put(String.valueOf(w.charAt(0)), String.valueOf(w.charAt(w.length() - 1)));
            }

        } return newMap;

    }
}
