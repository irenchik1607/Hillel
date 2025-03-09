package Lesson_9;

public class Man extends Person{

    public static final String MALE  = "Чоловік";

    public Man(String MALE, String name, int age, String profession) {
        super(name, age, profession);
    }

    Man man = new Man("Чоловік", "Олександр", 40, "Водій");


}
