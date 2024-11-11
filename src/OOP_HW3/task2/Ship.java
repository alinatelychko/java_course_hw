package OOP_HW3.task2;

public class Ship extends Vehicle{
    private int passengers;
    private String port;

    public Ship(double price, int speed, int releaseYear, int passengers, String port) {
        super(price, speed, releaseYear);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Кількість пасажирів: " + passengers);
        System.out.println("Порт приписки: " + port);

    }
}
