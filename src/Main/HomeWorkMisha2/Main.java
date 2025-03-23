package Main.HomeWorkMisha2;

public class Main {
    public static void main(String[] args) {


        // коло
        Сircle сircle = new Сircle(10);
        сircle.areaOfFigure();
        сircle.perimeterOfFigure();
        System.out.println();

        // рівносторонній трикутник
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        equilateralTriangle.areaOfFigure();
        equilateralTriangle.perimeterOfFigure();
        System.out.println();

        // рівнобедрений трикутник
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(10, 100);
        isoscelesTriangle.areaOfFigure();
        isoscelesTriangle.perimeterOfFigure();
        System.out.println();

        // прямокутний трикутник
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle(3, 10, 5);
        rightAngledTriangle.areaOfFigure();
        rightAngledTriangle.perimeterOfFigure();
        System.out.println();

        // квадрат
        Square square = new Square(8);
        square.areaOfFigure();
        square.perimeterOfFigure();
        System.out.println();

        // ромб
        Rhombus rhombus = new Rhombus(10, 5);
        rhombus.areaOfFigure();
        rhombus.perimeterOfFigure();
        System.out.println();

        // прямокутник
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.areaOfFigure();
        rectangle.perimeterOfFigure();
        System.out.println();

        // паралелограм
        Parallelogram parallelogram = new Parallelogram(10, 20, 15);
        parallelogram.areaOfFigure();
        parallelogram.perimeterOfFigure();
        System.out.println();

        // трапеція
        Trapeze trapeze = new Trapeze(10, 20, 15, 12, 12);
        trapeze.areaOfFigure();
        trapeze.perimeterOfFigure();
        System.out.println();
    }
}
