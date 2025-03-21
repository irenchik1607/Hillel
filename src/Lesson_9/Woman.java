package Lesson_9;

public class Woman extends Person {
    public static final String FEMALE  = "Жінка";

    public Woman(String name, int age, PersonRole role) {
        super(name, age, role);

    }

    public void showInfoAboutPerson() {

        System.out.println("Стать: " + FEMALE + ", Ім\"я: " + this.name + ", Вік: " + this.age + ", Професія: " + this.profession);

    }
}
