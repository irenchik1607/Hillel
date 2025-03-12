package HomeWorkMisha2;

public class RightAngledTriangle extends Triangle {

    int rightAngledPerimeter;
    String rightAngledArea;
    public int secondSideB;
    public int thirdSideHypotenuse;

    public RightAngledTriangle(int firstSideA, int secondSideB, int thirdSideHypotenuse) {
        super(firstSideA);
        this.secondSideB = secondSideB;
        this.thirdSideHypotenuse = thirdSideHypotenuse;
    }

    public int getSecondSideB() {
        return secondSideB;
    }

    public int getThirdSideC() {
        return thirdSideHypotenuse;
    }

    public void setSecondSideB(int secondSideB) {
        this.secondSideB = secondSideB;
    }

    public void setThirdSideC(int thirdSideHypotenuse) {
        this.thirdSideHypotenuse = thirdSideHypotenuse;
    }

    @Override
    public void perimeterOfFigure() {

        rightAngledPerimeter = firstSideA + secondSideB + thirdSideHypotenuse;
        System.out.println("Периметр прямокутного трикутника = " + rightAngledPerimeter);
        ;
    }

    public void areaOfFigure() {
        rightAngledArea = String.format("%.2f", 0.5 * firstSideA * secondSideB);
        System.out.println("Площа прямокутного трикутника = " + rightAngledArea);
    }


}
