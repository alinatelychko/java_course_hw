package OOP_HW7.task1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[2];
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введеть прізвище та ініціали: ");
            String name = scanner.nextLine();

            System.out.println("ВВедыть посаду:");
            String position = scanner.nextLine();

            System.out.println("Введіть рік надходження на роботу:");
            int year = 0;
            boolean validInput = false;

            while (!validInput) {
              try {
                  year = scanner.nextInt();
                  scanner.nextLine();

                  if (year>1900){
                      validInput = true;
                  }else {
                      System.out.println("Ви не правильно ввели рік");
                  }
              } catch (InputMismatchException e){
                  System.out.println("Помилка");
                  scanner.nextLine();

              }

            }

            workers[i] = new Worker(name, position, year);
        }

  Arrays.sort(workers);

        Interface main = new Main();
        main.showWorkers(workers);
    }


    @Override
    public  void showWorkers(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }
}
