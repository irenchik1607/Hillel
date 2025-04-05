package java.Lesson_13;


import java.util.LinkedHashMap;
import java.util.Map;


public class Home_13_1 {
    public static void main(String[] args) {

        String[] stringValues = {"12aqa34", "tiredLife","eva","eva"};
        System.out.println(getLengthOfStrings(stringValues));
    }

    public  static Map<String, Integer> getLengthOfStrings(String[] stringValues){
        Map<String, Integer> lengthOfStrings = new LinkedHashMap<>();
        for(String s:stringValues){
            lengthOfStrings.put(s, s.length());
        } return lengthOfStrings;
    }
}
