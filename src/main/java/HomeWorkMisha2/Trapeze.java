package java.HomeWorkMisha2;

public class Trapeze extends Parallelogram{

    int lateralFirstSide;
    int lateralSecondSide;

    public Trapeze(int oneSide, int height, int secondLongSide, int lateralFirstSide, int lateralSecondSide) {
        super(oneSide, height, secondLongSide);
        this.lateralFirstSide = lateralFirstSide;
        this.lateralSecondSide = lateralSecondSide;
    }

    public int getLateralFirstSide() {
        return lateralFirstSide;
    }

    public int getLateralSecondSide() {
        return lateralSecondSide;
    }

    public void setLateralFirstSide(int lateralFirstSide) {
        this.lateralFirstSide = lateralFirstSide;
    }

    public void setLateralSecondSide(int lateralSecondSide) {
        this.lateralSecondSide = lateralSecondSide;
    }

    public void areaOfFigure() {
        area = (oneSide + secondLongSide)*height/2;
        System.out.println("Площа трапеції = " + area);
    }

    public void perimeterOfFigure() {
        perimeter = oneSide + secondLongSide + lateralFirstSide + lateralSecondSide ;
        System.out.println("Периметр трапеції = " + perimeter);
    }
}
