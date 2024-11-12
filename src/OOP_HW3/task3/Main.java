package OOP_HW3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String proKey = "Pro";
        String ExpKey = "Exp";

        System.out.println("Введіть ключ доступу: ");
        String userKey = scanner.nextLine();

        DocumentWorker documentWorker;

        if (userKey.equals(proKey)){
           documentWorker = new ProDocumentWorker();
            System.out.println("ви використовуєте версію Про");
        }else if (userKey.equals(ExpKey)){
            documentWorker = new ExpertDocumentWorker();
            System.out.println("ви використовуєте версію Експерт");
        } else {
            documentWorker = new DocumentWorker();
            System.out.println("ви використовуєте безкоштовну версію");
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

    }


}
