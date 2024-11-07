package OOP_HW1.thirdTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Acer", 2010);
        computers[1] = new Computer("X", 2003);
        computers[2] = new Computer("Mac", 2012);
        computers[3] = new Computer("HP", 2009);
        computers[4] = new Computer("Dell", 2020);

        for (int i = 0; i < computers.length; i++) {
            computers[i].show();
            System.out.println(" - - - - - ");

        }
    }
}
