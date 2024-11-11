package OOP_HW3.task2;

public class Car extends Vehicle{
    private String model;

    public Car(double price, int speed, int releaseYear, String model) {
        super(price, speed, releaseYear);
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Марка автомобіля: " + model);
    }
}
