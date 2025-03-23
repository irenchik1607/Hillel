package Main.Lesson_12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Створіть колекцію, що буде мати у собі наступні числа 3, 14, 15, 92, 6 як окремі елементи.
        System.out.println("Числа: " + intArray());
        System.out.println();

        // Створіть колекцію елементів, що буде містити три рядка - ваше ім’я, призвище та по-батькові як окремі елементи.
        System.out.println("ФІО: " + stringArray());
        System.out.println();

        // Створіть сет, та переконайтеся, що він може зберігати лише унікальні елементи.
        System.out.println("Сет без повторів: " + uniquenessCheck());
        System.out.println();

        // Створіть мапу, що буде містити міста України та їх телефоний код(наприклад Харків - 057).
        System.out.println("Мапа кодів: " + townsCode());
    }

    public static Collection<Integer> intArray() {
        Collection<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 14, 15));
        arrayList.add(92);
        arrayList.add(6);
        return arrayList;
    }

    public static Collection<String> stringArray() {
        Collection<String> arrayStringList = new ArrayList<>(Arrays.asList("Чиркова", "Ірина"));
        arrayStringList.add("Олександрівна");
        return arrayStringList;
    }

    public static Set<Integer> uniquenessCheck() {
        Set<Integer> uniquenessSet = new LinkedHashSet<>();
        uniquenessSet.add(1);
        uniquenessSet.add(2);
        uniquenessSet.add(11);
        uniquenessSet.add(7);
        uniquenessSet.add(3);
        uniquenessSet.add(10);
        uniquenessSet.add(7);
        uniquenessSet.add(1);
        return uniquenessSet;
    }

    public static Map<String, String> townsCode() {
        Map<String, String> townsCodeValue = new LinkedHashMap<>();
        townsCodeValue.put("Дніпро", " 056");
        townsCodeValue.put("Київ", " 044");
        townsCodeValue.put("Харків", " 057");
        townsCodeValue.put("ЯкесьТамМісто", " 999");
        return townsCodeValue;
    }

}
