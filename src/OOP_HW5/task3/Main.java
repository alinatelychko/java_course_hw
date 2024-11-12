package OOP_HW5.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        Collections.addAll(in,1,2,3,4,5,6,7,8,9);

        ListIterator<Integer> iterator = in.listIterator();
        while(iterator.hasNext())
        {
            int currentNum = iterator.next();
            iterator.set(currentNum + 1);
        }
        System.out.println(in);
    }
}
