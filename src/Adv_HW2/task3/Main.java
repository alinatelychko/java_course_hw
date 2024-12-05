package Adv_HW2.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> cityFamilyMap = new HashMap<>();

        System.out.println("ВВедіть дані у форматі: місто та прізвище. Щоб завершити напишіть'стоп'");

      while(true){
          System.out.println("ВВедіть Місто:");
          String town = scanner.nextLine();
          if (town.equalsIgnoreCase("стоп"))break;

          System.out.println("ВВедіть прізвище:");
          String surname = scanner.nextLine();

          cityFamilyMap.put(town, surname);

      }

        System.out.println("Увесь лист:");

        for (Map.Entry<String, String> entry : cityFamilyMap.entrySet()) {
            System.out.println(entry.getKey() + ", "+ entry.getValue());
        }

        System.out.println("Щоб перевірити чи існує місто у пошуку, введіть його назву: ");

        String searchCity = scanner.nextLine();

        if(cityFamilyMap.containsKey(searchCity)){
            System.out.println("В місті "+searchCity+ cityFamilyMap.get(searchCity));
        }else{
            System.out.println("mistake");

        }



    }
}
