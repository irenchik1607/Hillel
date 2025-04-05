package Lesson_18;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import java.Lesson_18.Calculator;

public class CalculatorTest {


    @Test(
            dataProvider = "addProvideMethod",
            description = "Перевірка додавання двох чисел",
            priority = 1
    )
    public void testAddition(int number1, int number2, int addExpected) {
//        int number1 = 10;
//        int number2 = 2;
//        int addExpected = 12;
//        int subtractExpected = 8;
//        int multiplyExpected = 20;
//        double divideExpected = 5;

        Calculator calculator = new Calculator(number1, number2);
        int addActual = calculator.addMethod();
        Assert.assertEquals(addActual, addExpected);
    }

    @DataProvider
    public Object[][] addProvideMethod() {
        return new Object[][]{{10, 2, 12}, {15, 5, 20}};
    }


    @Test(
            dataProvider = "subtractProvideMethod",
            description = "Перевірка віднімання двох чисел",
            priority = 2


    )
    public void testSubtraction(int number1, int number2, int subtractExpected) {
        Calculator calculator = new Calculator(number1, number2);
        int subtractActual = calculator.subtractMethod();
        Assert.assertEquals(subtractActual, subtractExpected);
    }

    @DataProvider
    public Object[][] subtractProvideMethod() {
        return new Object[][]{{10, 2, 8}, {15, 5, 10}};
    }

    @Test(
            dataProvider = "multiplyProvideMethod",
            description = "Перевірка множення двох чисел",
            priority = 4
    )
    public void testMultiplication(int number1, int number2, int multiplyExpected) {
        Calculator calculator = new Calculator(number1, number2);
        int multiplyActual = calculator.multiplyMethod();
        Assert.assertEquals(multiplyActual, multiplyExpected);
    }

    @DataProvider
    public Object[][] multiplyProvideMethod() {
        return new Object[][]{{10, 2, 20}, {15, 5, 75}};
    }


    @Test(
            dataProvider = "divideProvideMethod",
            description = "Перевірка ділення двох чисел",
            priority = 3
    )
    public void testDivision(int number1, int number2, double divideExpected) {

        Calculator calculator = new Calculator(number1, number2);
        double divideActual = calculator.divideMethod();
        Assert.assertEquals(divideActual, divideExpected);
    }

    @DataProvider
    public Object[][] divideProvideMethod() {
        return new Object[][]{{10, 2, 5}, {15, 5, 3}};
    }

    @Test(
            dataProvider = "notValidDivideProvideMethod",
            description = "Перевірка ділення двох чисел",
            priority = 5
            //expectedExceptions = {ArithmeticException.class}
    )
    public void notValidTestDivision(int number1, int number2, double divideExpected) {

        Calculator calculator = new Calculator(number1, number2);
        Assert.assertThrows(ArithmeticException.class, () -> calculator.divideMethod());
    }

    @DataProvider
    public Object[][] notValidDivideProvideMethod() {
        return new Object[][]{{15, 0, 3}};
    }

}
