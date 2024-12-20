package OOP_HW1.FirstTask;

public class Rectangle {

private double side1;
private double side2;

    public Rectangle(double side2, double side1) {
        this.side2 = side2;
        this.side1 = side1;
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

    public  double areaCalculator () {
        return side1*side2;
    }

    public double perimeterCalculator () {
        return 2*(side1+side2);
    }
}
