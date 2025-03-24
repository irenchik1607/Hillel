package HomeWorkMisha2;

public class Rectangle extends Quadrangle{
    int secondSide;

    public Rectangle(int oneSide, int secondSide) {
        super(oneSide);
        this.secondSide = secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void areaOfFigure() {
        area = oneSide * secondSide;
        System.out.println("Площа прямокутника = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = 2*oneSide+2*secondSide;
        System.out.println("Периметр прямокутника = " + perimeter);
    }


}
