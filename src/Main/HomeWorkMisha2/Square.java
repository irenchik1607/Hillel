package HomeWorkMisha2;

public class Square extends Quadrangle {


    public Square(int oneSide) {
        super(oneSide);
    }

    public void areaOfFigure() {
        area = oneSide * oneSide;
        System.out.println("Площа квадрата = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = 4*oneSide;
        System.out.println("Периметр квадрата = " + perimeter);
    }

}
