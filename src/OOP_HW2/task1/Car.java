package OOP_HW2.task1;

public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 1999;
        this.color = "Purple";
    }

    public Car(int year) {
        this.year = year;
        this.color = "Red";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
