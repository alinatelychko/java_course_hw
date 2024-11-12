package OOP_HW5.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        Collections.addAll(friends,  "Enn", "Hannah","Andrew", "Oleg");

        System.out.println(friends);

        Collections.sort(friends);
        System.out.println(friends);
    }
}
