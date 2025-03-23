package Main.Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class Home_13_4 {
    public static void main(String[] args) {

        String[] massive = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println(mergeStringsByFirstChar(massive));
    }

//    Ця задача передбачає створення і повернення Map<String, String>, де ключами будуть різні перші
//    символи зустрінутих рядків, а значеннями будуть всі рядки, які починаються з цього символу, об'єднані
//    у порядку їх зустрічі у вихідному масиві.
//
//    mergeStringsByFirstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//    mergeStringsByFirstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//    mergeStringsByFirstChar([])


    public static Map<String, String> mergeStringsByFirstChar(String[] massive) {
        Map<String, String> newMap = new HashMap<>();

        for (String m : massive) {
            if (!m.isEmpty()){
                String startLetter = String.valueOf(m.charAt(0));
                if (newMap.containsKey(startLetter)){
                    newMap.put(startLetter, newMap.get(startLetter)+m);
                } else {
                    newMap.put(startLetter, m);
                }
            }
        }return newMap;
    }
}
