package java.HomeWorkMisha2;

public class Parallelogram extends Rhombus{

    int secondLongSide;

    public Parallelogram(int oneSide, int height, int secondLongSide) {
        super(oneSide, height);
        this.secondLongSide = secondLongSide;
    }

    public int getSecondSideParallelogram() {
        return secondLongSide;
    }

    public void setSecondSideParallelogram(int secondLongSide) {
        this.secondLongSide = secondLongSide;
    }

    public void areaOfFigure() {
        area = oneSide * height;
        System.out.println("Площа паралелограма = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = 2*oneSide + 2*secondLongSide;
        System.out.println("Периметр паралелограма = " + perimeter);
    }
}
