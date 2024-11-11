package OOP_HW3.task2;

public class Vehicle {
    private double price;
    private int speed;
    private int releaseYear;

    public Vehicle(double price, int speed, int releaseYear) {
        this.price = price;
        this.speed = speed;
        this.releaseYear = releaseYear;
    }


    public void showInfo() {
        System.out.println("Ціна: " + price);
        System.out.println("Швидкість: " + speed + " км/год");
        System.out.println("Рік випуску: " +  releaseYear);
    }
}
