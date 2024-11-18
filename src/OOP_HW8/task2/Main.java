package OOP_HW8.task2;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("TP-Link", 50.75f, "SN67890", 1000, "00:1A:2B:3C:4D:5E");

        System.out.println(monitor);
        System.out.println(ethernetAdapter);
    }
}
