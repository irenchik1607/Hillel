package java.HomeWorkMisha2;

public class IsoscelesTriangle extends Triangle {


    public int secondSideBEqualC;

    public IsoscelesTriangle(int firstSideA, int secondSideBEqualC) {
        super(firstSideA);
        this.secondSideBEqualC = secondSideBEqualC;
    }

    public int getSecondSideBEqualC() {
        return secondSideBEqualC;
    }

    public void setSecondSideBEqualC(int secondSideBEqualC) {
        this.secondSideBEqualC = secondSideBEqualC;
    }

    @Override
    public void perimeterOfFigure() {

        perimeter = firstSideA + secondSideBEqualC * 2;
        System.out.println("Периметр рівнобедреного трикутника = " + perimeter);
        ;
    }

    //
    public void areaOfFigure() {
        area = (firstSideA / 4) * Math.sqrt(4 * secondSideBEqualC * secondSideBEqualC - firstSideA * firstSideA);
        System.out.println("Площа рівнобедреного трикутника = " + area);
    }


}
