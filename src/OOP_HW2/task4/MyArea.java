package OOP_HW2.task4;

public class MyArea {
    private final double PI = 3.14;
    private double radius;

    public double getPI() {
        return PI;
    }

    public MyArea(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle(){
        return (PI * Math.pow(radius,2));
    }
}
