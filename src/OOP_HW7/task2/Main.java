package OOP_HW7.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main implements Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] priceMain = new Price[2];

        for (int i = 0; i < priceMain.length; i++) {
            System.out.println("ВВедіть назву продукту");
            String productName = scanner.nextLine();


            System.out.println("ВВедіть назву магазину");
            String storeName = scanner.nextLine();


            System.out.println("ВВедіть прайс");
            int price = scanner.nextInt();
            scanner.nextLine();

            priceMain[i] = new Price(productName, storeName, price);

        }
        Arrays.sort(priceMain);

         Interface main = new Main();

        main.result(priceMain);

    }

    @Override
    public void result(Price[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);

        }
    }
}
