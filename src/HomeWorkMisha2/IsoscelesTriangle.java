package HomeWorkMisha2;

public class IsoscelesTriangle extends Triangle {

    int isoscelesPerimeter;
    String isoscelesArea;
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

        isoscelesPerimeter = firstSideA + secondSideBEqualC * 2;
        System.out.println("Периметр рівнобедреного трикутника = " + isoscelesPerimeter);
        ;
    }

    //
    public void areaOfFigure() {
        isoscelesArea = String.format("%.2f", (firstSideA / 4) * Math.sqrt(4 * secondSideBEqualC * secondSideBEqualC - firstSideA * firstSideA));
        System.out.println("Площа рівнобедреного трикутника = " + isoscelesArea);
    }


}
