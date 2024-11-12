package OOP_HW4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterTemperature convert = new ConverterTemperature();
        System.out.println("Введіть градуси в Цельсій: ");
        double result = scanner.nextDouble();
        double f = convert.farenhait(result);
        double k = convert.kelvin(result);

        System.out.println("в Фаренгейтах: "+ f);
        System.out.println("в Кельвінах: "+ k);

    }
}
