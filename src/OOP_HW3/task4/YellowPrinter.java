package OOP_HW3.task4;

public class YellowPrinter extends Printer{
    @Override
    public void print(String value){
        System.out.println("\u001B[33m" + value + "\u001B[0m");
    }
}
