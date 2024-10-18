package HW8;

//Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
//який приймає як параметри три цілочислові значення та повертає значення кожного аргументу,
//поділеного на 5.

public class Calculator {
    public static void main(String[] args) {
        calculate(30, 40,50);
    }

    static void calculate (int a, int b, int c){

        System.out.println("Результат 1:"+( a/5));
        System.out.println("Результат 2:"+( b/5));
        System.out.println("Результат 3:"+( c/5));

    }
}
