package Main.HomeWorkMisha2;

public class Rhombus extends Square{
    int height;

    public Rhombus(int oneSide, int height) {
        super(oneSide);
        this.height = height;
    }

    public void areaOfFigure() {
        area = oneSide * height;
        System.out.println("Площа ромба = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = 4*oneSide;
        System.out.println("Периметр ромба = " + perimeter);
    }
}
