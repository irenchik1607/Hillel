package Lesson_18;

public class Calculator {
    private int firstNumeric;
    private int secondNumeric;

    public Calculator(int firstNumeric, int secondNumeric) {
        this.firstNumeric = firstNumeric;
        this.secondNumeric = secondNumeric;
    }

    public int addMethod() {
        int add = firstNumeric + secondNumeric;
        return add;
    }

    public int subtractMethod() {
        int subtract = firstNumeric - secondNumeric;
        return subtract;
    }

    public int multiplyMethod() {
        int multiply = firstNumeric * secondNumeric;
        return multiply;
    }

    public double divideMethod() {
//        try {
            double divide = firstNumeric / secondNumeric;
            return divide;
//        } catch (ArithmeticException e) {
//            System.out.println("Помилка: " + e.getMessage());
//            return 0;
//        }

    }
}
