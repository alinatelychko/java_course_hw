package Adv_HW2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедіть 5 слів, розділивши їх комами ");
        String input = sc.nextLine();
      words.addAll(Arrays.asList(input.split(", ")));



        if (words.size()!=5){
            System.out.println("error");
        }else {
            System.out.println("Подвоєні значення:");
            System.out.println(doubleValues(words));
        }
    }

    public static ArrayList<String> doubleValues (ArrayList<String> list){
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            res.add(list.get(i));
            res.add(list.get(i));
        }
        return res;
    }
}
