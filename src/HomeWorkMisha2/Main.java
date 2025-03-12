package HomeWorkMisha2;

public class Main {
    public static void main(String[] args) {


        // коло
        Сircle сircle = new Сircle(10);
        сircle.areaOfFigure();
        сircle.perimeterOfFigure();

        // рівносторонній трикутник
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        equilateralTriangle.areaOfFigure();
        equilateralTriangle.perimeterOfFigure();

        // рівнобедрений трикутник
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(10, 100);
        isoscelesTriangle.areaOfFigure();
        isoscelesTriangle.perimeterOfFigure();

        // прямокутний трикутник
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle(3, 10, 5);
        rightAngledTriangle.areaOfFigure();
        rightAngledTriangle.perimeterOfFigure();

        //- чотирикутник:
        //    - квадрат
        //    - прямокутник
        //    - паралелограм
        //    - трапеція
        //    - ромб
    }
}
