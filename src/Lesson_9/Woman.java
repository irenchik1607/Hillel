package Lesson_9;

public class Woman extends Person {
    public static final String FEMALE  = "Жінка";

    public Woman(String name, int age, PersonRole role) {
        super(name, age, role);

    }

    public void showInfoAboutPerson() {
        String sex;
        if (this instanceof Woman) {
            sex = Woman.FEMALE;
        } else {
            return;
        }
        System.out.println("Стать: " + sex + ", Ім\"я: " + this.name + ", Вік: " + this.age + ", Професія: " + this.profession);

    }
}
