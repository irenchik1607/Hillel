package HomeWorkMisha2;

public class Parallelogram extends Rhombus{

    int secondSideParallelogram;

    public Parallelogram(int oneSide, int height, int secondSideParallelogram) {
        super(oneSide, height);
        this.secondSideParallelogram = secondSideParallelogram;
    }

    public int getSecondSideParallelogram() {
        return secondSideParallelogram;
    }

    public void setSecondSideParallelogram(int secondSideParallelogram) {
        this.secondSideParallelogram = secondSideParallelogram;
    }

    public void areaOfFigure() {
        area = oneSide * height;
        System.out.println("Площа паралелограма = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = 2*oneSide + 2*secondSideParallelogram;
        System.out.println("Периметр паралелограма = " + perimeter);
    }
}
