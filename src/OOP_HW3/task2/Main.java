package OOP_HW3.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(1000000, 900, 2020, 10000, 300);
        Vehicle car = new Car( 30000, 150, 2021, "Toyota");
        Vehicle ship = new Ship( 500000, 60, 2018, 1000, "Odesa");



        System.out.println("Інформація про літак:");
        plane.showInfo();
        System.out.println("\nІнформація про автомобіль:");
        car.showInfo();
        System.out.println("\nІнформація про корабель:");
        ship.showInfo();
    }
}
