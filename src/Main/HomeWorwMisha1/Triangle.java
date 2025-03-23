package Main.HomeWorwMisha1;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideC = sideC;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double perimeterOfTriangle(){
        double perimeter = sideA+sideB+sideC;
        return perimeter;
    }

    public double areaOfTriangle (){
        double semiPerimeter = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    return area;
    }
}
