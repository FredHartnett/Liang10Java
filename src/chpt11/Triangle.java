package chpt11;
//Intro to Java Programming 10th ed. Y. Daniel Liang

public class Triangle extends SimpleGeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() { }
    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter() { return side1 + side2 + side3; }
}
