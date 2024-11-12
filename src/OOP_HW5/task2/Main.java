package OOP_HW5.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        Collections.addAll(animal, "dog", "bird", "elephant", "cow", "cat", "pig", "mouse", "rat");

        animal.remove("elephant");
        animal.remove("cat");
        animal.remove("rat");
        System.out.println(animal);

    }


}
