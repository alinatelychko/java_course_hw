package Adv_HW2.task2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        System.out.println("Введіть кількість чисел:");

        int N = num.nextInt();
        LinkedList<Integer>  listOfNumbers = getIntegerList(N);


        int x = getMinimum(listOfNumbers);

        System.out.println("Найменше з введених чисел:"+x);



    }

    public static LinkedList<Integer> getIntegerList(int n){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer>  list = new LinkedList<>();

        System.out.println("ВВедіть " +
                n +
                " цілих чисел:");

        for (int i = 0; i <n ; i++) {
            list.add(scanner.nextInt());

        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<min) {
                min=list.get(i);
            }

        }
     return min;
    }
}
