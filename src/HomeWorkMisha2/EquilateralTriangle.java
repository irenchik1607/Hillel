package HomeWorkMisha2;

public class EquilateralTriangle extends Triangle {
    int equilateralPerimeter;
    String equilateralArea;

    public EquilateralTriangle(int firstSideA) {
        super(firstSideA);
    }

    @Override
    public void perimeterOfFigure() {

        equilateralPerimeter = firstSideA * 3;
        System.out.println("Периметр рівностороннього трикутника = " + equilateralPerimeter);
        ;
    }

    //
    public void areaOfFigure (){
        equilateralArea = String.format("%.2f", (Math.sqrt(3)/4)*firstSideA * firstSideA);
        System.out.println("Площа рівностороннього трикутника = " + equilateralArea);
    };
}
