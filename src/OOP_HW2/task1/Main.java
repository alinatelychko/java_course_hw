package OOP_HW2.task1;

public class Main {
    public static void main(String[] args) {
        Car carWithout = new Car();
        Car carWithOne = new Car(2000);
        Car carWithTwo = new Car(2001, "Blue");


        System.out.println("Без параметрів: " + carWithout.getColor() + ", "+ carWithout.getYear());
        System.out.println("Без параметрів: " + carWithOne.getColor()+ ", " + carWithOne.getYear());
        System.out.println("Без параметрів: " + carWithTwo.getColor() + ", " + carWithTwo.getYear());
    }

}
