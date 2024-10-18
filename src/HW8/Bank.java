package HW8;

//Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку,
//яка допомагає визначити, погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має
// становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
//Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//
// Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод
//виводить на екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення
//        про відсутність боргу).

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму платежу:");
        int amount = scanner.nextInt();
        System.out.println("Ви внесли: "+amount);
        System.out.println("Залишок по кредиту становить: "+ toPay(amount));
         allPaid(amount);

    }

    static int toPay (int a){

        int result = 700 - a;
        return result;
    }

    static void allPaid (int a){
        if ((700 - a)==0){
            System.out.println("Ви виплатили весь кредит!");
        }
    }

}
