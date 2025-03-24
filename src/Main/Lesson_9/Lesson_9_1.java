package Lesson_9;

public class Lesson_9_1 {
    public static void main(String[] args) {

//        Person firstPerson = new Person("Міша :)", 35, "Айтішник :)");
//        Person secondPerson = new Person("Міла", 20, "Балерина");
//        Person thirdPerson = new Person("Іванка", 40, "Мама у декреті");
//
//        System.out.println("Ім\"я: " + firstPerson.getName() + ", Вік: " + firstPerson.getAge() + ", Професія: " + firstPerson.getProfession());
//        System.out.println("Ім\"я: " + secondPerson.getName() + ", Вік: " + secondPerson.getAge() + ", Професія: " + secondPerson.getProfession());
//        System.out.println("Ім\"я: " + thirdPerson.getName() + ", Вік: " + thirdPerson.getAge() + ", Професія: " + thirdPerson.getProfession());
//
//        System.out.println();
//        secondPerson.setProfession("Офіціантка");
//
//        System.out.println("Ім\"я: " + firstPerson.getName() + ", Вік: " + firstPerson.getAge() + ", Професія: " + firstPerson.getProfession());
//        System.out.println("Ім\"я: " + secondPerson.getName() + ", Вік: " + secondPerson.getAge() + ", Професія: " + secondPerson.getProfession());
//        System.out.println("Ім\"я: " + thirdPerson.getName() + ", Вік: " + thirdPerson.getAge() + ", Професія: " + thirdPerson.getProfession());
//        System.out.println();

        //використовую інтерфейс + enum
        Man man = new Man("", 10, PersonRole.DOCTOR);
        man.showInfoAboutPerson();

        Woman woman = new Woman("Мирося", 9, PersonRole.ARTIST);
        woman.showInfoAboutPerson();

        woman.setProfession(PersonRole.TEACHER);
        woman.showInfoAboutPerson();

        man.setName("Павло");
        man.showInfoAboutPerson();
    }
}
