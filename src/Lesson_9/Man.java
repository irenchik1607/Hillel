package Lesson_9;

public class Man extends Person {

    public static final String MALE = "Чоловік";

    public Man( String name, int age, PersonRole role) {
        super(name, age, role);
    }

    public void showInfoAboutPerson() {
        System.out.println("Стать: " + MALE + ", Ім\"я: " + this.name + ", Вік: " + this.age + ", Професія: " + this.profession);
    }
}
