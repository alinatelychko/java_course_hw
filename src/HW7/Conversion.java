package HW7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть валюту(dollar, euro):");
        String currencyFrom = scanner.next();

        System.out.println("Введіть суму: " );
        String amount  = scanner.next();

        System.out.println("Введіть валюту конвертаціі(dollar, euro): " );
        String currencyTo = scanner.next();

        System.out.println("Сума конвертації з " + currencyFrom + " у " + currencyTo + " дорівнює: ");

        if (currencyFrom.equals("dollar") && currencyTo.equals("euro")) {
            System.out.println(dollarToEuro(Integer.parseInt(amount)) + " євро");
        } else if (currencyFrom.equals("euro") && currencyTo.equals("dollar")) {
            System.out.println(euroToDollar(Integer.parseInt(amount)) + " доларів");
        } else {
            System.out.println("Помилка! Некоректна комбінація валют.");
        }

    }

    static double dollarToEuro(int a){
        double result = a*0.92;
        return result;
    }

    static double euroToDollar(int a){
        double result = a*1.09;
        return result;
    }



}
