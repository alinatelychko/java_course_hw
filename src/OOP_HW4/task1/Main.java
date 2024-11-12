package OOP_HW4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler a1 = new DOCHandler();
        AbstractHandler a2 = new TXTHandler();
        AbstractHandler a3 = new XMLHandler();

        AbstractHandler[] a = {a1,a2,a3};

        for (int i = 0; i < a.length; i++) {
            System.out.println();
            a[i].open();
            a[i].create();
            a[i].change();
            a[i].save();
            System.out.println();

        }


    }
}
