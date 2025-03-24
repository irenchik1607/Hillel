package HomeWorkMisha2;

public class EquilateralTriangle extends Triangle {


    public EquilateralTriangle(int firstSideA) {
        super(firstSideA);
    }

    @Override
    public void perimeterOfFigure() {

        perimeter = firstSideA * 3;
        System.out.println("Периметр рівностороннього трикутника = " + perimeter);
        ;
    }

    //
    public void areaOfFigure (){
        area =  (Math.sqrt(3)/4)*firstSideA * firstSideA;
        System.out.println("Площа рівностороннього трикутника = " + area);
    };
}
