package OOP_HW2.task2;

public class Car {
        private int year;
        private int speed;
        private int weight;
        private String color;

    public Car(int year) {
        this.year = year;
        this.speed = 50;
        this.weight = 1000;
        this.color = "red";
    }

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 2000;
        this.color = "indigo";
    }

    public Car(int year, int speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "blue";
    }

    public Car(int year, int speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show (){

        System.out.println("Рік: " + year + ", Швидкість: " + speed + " км/год, Вага: " + weight + " кг, Колір: " + color);

    }

}
