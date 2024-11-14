package OOP_HW7.task3;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("введіть  число а = ");
        double a = scanner.nextDouble();
        System.out.println("Введіть число b: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("введіть операцію одну з +, -, *, / ");
        String operation = scanner.nextLine();


        double result = 0;

        switch (operation){
            case "+": result = calculator.sum(a,b);
            break;
            case "-": result = calculator.sub(a,b);
                break;
            case "*": result = calculator.mul(a,b);
                break;
            case "/": result = calculator.div(a,b);
                break;
            default:
                System.out.println("mistake");
                return;
        }
        System.out.println(result);

    }
}

