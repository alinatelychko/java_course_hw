package OOP_HW2.task3;

public class Car {
    private int year;
    private int speed;
    private int weight;
    private String color;

    public Car() {
        this(2003,50,1000,"red");
    }

    public Car(int year) {
        this(year,50,1000,"red");
    }

    public Car(int year, int speed) {
        this(year,speed,2000,"indigo");
    }

    public Car(int year, int speed, int weight) {
        this(year, speed, weight, "blue" );
    }

    public Car(int year, int speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void show (){

        System.out.println("Рік: " + year + ", Швидкість: " + speed + " км/год, Вага: " + weight + " кг, Колір: " + color);

    }


}
