package Lesson_9;

public abstract class Person implements Displayable {
    protected String name;
    protected int age;
    protected PersonRole profession;

    public Person(String name, int age, PersonRole role) {
        if (name == null||name.isEmpty()){
            throw new MyException();
        }

        if (age<0){
            throw new IllegalArgumentException ("Вік не може бути від'ємним");
        }



        this.name = name;
        this.age = age;
        this.profession = role;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(PersonRole role) {
        this.profession = role;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonRole getProfession() {
        return profession;
    }

    public void showInfoAboutPerson() {

    }

}
