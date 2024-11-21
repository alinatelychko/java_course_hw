package Adv_HW1.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(21);
        list.add(13);
        list.add(25);
        list.add(22);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer in = iterator.next();
            System.out.println(in);
        }
    }
}
