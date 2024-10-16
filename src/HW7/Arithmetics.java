import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arithmetics {
    public static void main(String[] args) {
        System.out.println("Введіть два числа, розділивши їх комами: ");
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String[] numbers = input.split(",");

        int number1 = Integer.parseInt(numbers[0].trim());
        int number2 = Integer.parseInt(numbers[1].trim());

        System.out.println("Перше число: " + number1);
        System.out.println("Друге число: " + number2);

        System.out.println("Оберіть одну з операцій, яку ви хочете виконати з числами: додавання, віднімання, множення, ділення.");
        Scanner scanner1 = new Scanner(System.in);
        String operation  = scanner1.nextLine();
        System.out.println("Ви обрали операцію " + operation);

        switch (operation){
            case "додавання":
                System.out.println("Результат додавання:"+add(number1,number2));
                break;
            case "віднімання":
                System.out.println("Результат віднімання:"+ sub(number1,number2));
                break;
            case "множення":
                System.out.println("Результат множення:"+ mul(number1,number2));
                break;
            case "ділення":
                double result = div(number1, number2);
                if (result != Double.MAX_VALUE) {
                    System.out.printf("Результат ділення: %.4f\n", result);
                }
                break;
            default:
                System.out.println("Виникла помилка!");
        }


    }


    static  int add (int a, int b){
       int result = a + b;
       return result;
    }

    static int sub (int a, int b){
        int result = a - b;
        return result;
    }

    static int mul (int a, int b){
        int result = a * b;
        return result;
    }

    static double div (int a, int b) {
        if (b == 0) {
            System.out.println("No solution!");
            return Double.MAX_VALUE;
        } else {
            double result = a / b;
            return result;
        }
    }


}