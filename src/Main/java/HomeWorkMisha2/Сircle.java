package java.HomeWorkMisha2;

public class Сircle extends MathematicFigure {

    double radius;


    public Сircle(double radius) {
        this.radius = radius;
    }

    //    C = 2 · π · r
    public void areaOfFigure() {
        area = Math.PI * radius * radius;
        System.out.println("Площа кола= " + area);
    }

    ;

    public void perimeterOfFigure() {
        perimeter =  2 * Math.PI * radius;
        System.out.println("Периметр кола= " + perimeter);
    }

    ;
}
