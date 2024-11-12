package OOP_HW3.task3;

public class ProDocumentWorker extends DocumentWorker{


    public void editDocument(){
        System.out.println("Документ відредаговано");
    }

    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
