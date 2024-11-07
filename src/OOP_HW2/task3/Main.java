package OOP_HW2.task3;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car();
        Car car1 = new Car(2024);
        Car car2 = new Car( 2000, 70);
        Car car3 = new Car( 2020, 90, 1500);
        Car car4 = new Car( 2008, 40, 1800, "yellow");

        car0.show();
        car1.show();
        car2.show();
        car3.show();
        car4.show();
    }
}
