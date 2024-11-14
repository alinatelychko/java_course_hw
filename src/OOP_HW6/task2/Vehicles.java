package OOP_HW6.task2;

public enum Vehicles {

    CAR(20000, "Red"),
    TRUCK(35000, "Blue"),
    MOTORCYCLE(15000, "Black"),
    BUS(50000, "Yellow");

    private int price;
    private String color;


    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
