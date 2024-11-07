package OOP_HW1.FirstTask;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 15);

        System.out.println("Площа: " + rectangle.areaCalculator());
        System.out.println(("периметр: " + rectangle.perimeterCalculator()));
    }
}
