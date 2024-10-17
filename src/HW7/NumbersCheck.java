package HW7;

import java.util.Scanner;

//Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//1) чи є введене число позитивним, чи негативним;
//2) чи є воно простим (використовуйте техніку перебору значень).
//Просте число – це натуральне число, яке ділиться на 1 й саме на себе. Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//3) чи ділиться воно на 2, 5, 3, 6, 9 без залишку.

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть будь-яке число:");
        int number = scanner.nextInt();

        positiveOrNegative(number);

        if (isPrime(number)) {
            System.out.println("Число " + number + " є простим!");
        } else {
            System.out.println("Число " + number + " не є простим!");
        }

        divisibility(number);

    }

static  void positiveOrNegative (int a) {

        if (a>=0){
            System.out.println("Число " +a+ " є додатнім!");
        } else {
            System.out.println("Число " +a+ " є відʼємним!");
        }
    }



    static boolean isPrime(int num) {
        // Від'ємні числа, 0 і 1 не є простими
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void divisibility (int a){
        if (a%2==0){
            System.out.println("Число " + a + " ділиться на 2!");
        }
        if (a%3==0){
            System.out.println("Число " + a + " ділиться на 3!");
        }
        if (a%5==0){
            System.out.println("Число " + a + " ділиться на 5!");
        }
        if (a%6==0){
            System.out.println("Число " + a + " ділиться на 6!");
        }
        if (a%9==0){
            System.out.println("Число " + a + " ділиться на 9!");
        }
        if ( a%2!=0 && a%3!=0 && a%5!=0 && a%6!=0 && a%9!=0 ){
            System.out.println("Число не ділиться на 2, 3, 5, 6 чи 9");
        }

    }

}


