package OOP_HW3.task4;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer yellow = new YellowPrinter();
        Printer blue = new BluePrinter();
        Printer red = new RedPrinter();

        printer.print("стандартний");
        yellow.print("жовтий");
        blue.print("синій");
        red.print("червоний");

    }
}
