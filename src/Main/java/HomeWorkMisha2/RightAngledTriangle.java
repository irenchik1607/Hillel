package java.HomeWorkMisha2;

public class RightAngledTriangle extends Triangle {

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

        perimeter = firstSideA + secondSideB + thirdSideHypotenuse;
        System.out.println("Периметр прямокутного трикутника = " + perimeter);
        ;
    }

    public void areaOfFigure() {
        area = 0.5 * firstSideA * secondSideB;
        System.out.println("Площа прямокутного трикутника = " + area);
    }


}
