package Lesson_9;

public class Lesson_9_1 {
    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.setName("Міша :)");
        firstPerson.setAge(35);
        firstPerson.setProfession("Айтішник :)");

        Person secondPerson = new Person();
        secondPerson.setName("Міла");
        secondPerson.setAge(20);
        secondPerson.setProfession("Балерина");

        Person thirdPerson = new Person();
        thirdPerson.setName("Іванка");
        thirdPerson.setAge(40);
        thirdPerson.setProfession("Мама у декреті");

        System.out.println("Ім\"я: " + firstPerson.getName() + ", Вік: " + firstPerson.getAge() + ", Професія: " + firstPerson.getProfession());
        System.out.println("Ім\"я: " + secondPerson.getName() + ", Вік: " + secondPerson.getAge() + ", Професія: " + secondPerson.getProfession());
        System.out.println("Ім\"я: " + thirdPerson.getName() + ", Вік: " + thirdPerson.getAge() + ", Професія: " + thirdPerson.getProfession());


        secondPerson.setProfession("Офіціантка");

        System.out.println("Ім\"я: " + firstPerson.getName() + ", Вік: " + firstPerson.getAge() + ", Професія: " + firstPerson.getProfession());
        System.out.println("Ім\"я: " + secondPerson.getName() + ", Вік: " + secondPerson.getAge() + ", Професія: " + secondPerson.getProfession());
        System.out.println("Ім\"я: " + thirdPerson.getName() + ", Вік: " + thirdPerson.getAge() + ", Професія: " + thirdPerson.getProfession());
    }
}
