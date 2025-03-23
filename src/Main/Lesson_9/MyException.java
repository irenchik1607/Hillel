package Main.Lesson_9;

public class MyException extends RuntimeException {
    public MyException() {
        super("Ім'я не може бути порожнім");
    }

}
