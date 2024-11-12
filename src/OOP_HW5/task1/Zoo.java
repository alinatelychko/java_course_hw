package OOP_HW5.task1;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();

        animal.add(0, "dog");
        animal.add(1,"bird");
        animal.add(2, "elephant");
        animal.add(3, "cow");
        animal.add(4, "cat");
        animal.add(5,"pig");
        animal.add(6, "mouse");
        animal.add(7, "rat");

        System.out.println(animal);
    }

}
