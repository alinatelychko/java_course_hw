package OOP_HW3.task4;

public class BluePrinter extends Printer{
    @Override
    public void print(String value){
        System.out.println("\u001B[34m" + value + "\u001B[0m");
    }
}
