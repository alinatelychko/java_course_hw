package Adv_HW2.task4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        while(true) {
            System.out.println("ВВодьте слова, стоп-слово - 'end'");
            String words = scanner.nextLine();
            if(words.equalsIgnoreCase("end")) break;

            list.add(words);
        }
        System.out.println("Введені слова:");
        for(String word : list){
            System.out.println(word);
        }

    }
}
