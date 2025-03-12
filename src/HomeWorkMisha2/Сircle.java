package HomeWorkMisha2;

public class Сircle extends MathematicFigure {

    double radius;
    String circleArea;
    String circlePerimeter;

    public Сircle(double radius) {
        this.radius = radius;
    }

    //    C = 2 · π · r
    public void areaOfFigure() {
        circleArea = String.format("%.2f", Math.PI * radius * radius);
        System.out.println("Площа кола= " + circleArea);
    }

    ;

    public void perimeterOfFigure() {
        circlePerimeter = String.format("%.2f", 2 * Math.PI * radius);
        System.out.println("Периметр кола= " + circlePerimeter);
    }

    ;
}
