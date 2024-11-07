package OOP_HW1.thirdTask;

public class Computer {
  private String brand;
    private int year;

    public Computer(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    public void show() {
        System.out.println("Бренд: " + brand);
        System.out.println("Процесор: " + year);
    }


}
