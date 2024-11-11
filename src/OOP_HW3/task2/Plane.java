package OOP_HW3.task2;

public class Plane extends Vehicle{
    private double altitude; // висота
    private int passengers;

    public Plane(double price, int speed, int releaseYear, double altitude, int passengers) {
        super(price, speed, releaseYear);
        this.altitude = altitude;
        this.passengers = passengers;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Висота: " + altitude + " м");
        System.out.println("Кількість пасажирів: " + passengers);
    }
}
