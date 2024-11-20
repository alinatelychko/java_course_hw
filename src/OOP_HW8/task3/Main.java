package OOP_HW8.task3;

public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung", 300.50f, "SN12345", 1920, 1080);
        Monitor monitor2 = new Monitor("Samsung", 300.50f, "SN12345", 1920, 1080);
        Monitor monitor3 = new Monitor("LG", 250.75f, "SN54321", 1280, 720);


        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("TP-Link", 50.75f, "SN67890", 1000, "00:1A:2B:3C:4D:5E");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("TP-Link", 50.75f, "SN67890", 1000, "00:1A:2B:3C:4D:5E");
        EthernetAdapter ethernetAdapter3 = new EthernetAdapter("Netgear", 75.00f, "SN09876", 2000, "00:1B:2C:3D:4E:5F");


        System.out.println("Monitor1 equals Monitor2: " + monitor1.equals(monitor2));
        System.out.println("Monitor1 equals Monitor3: " + monitor1.equals(monitor3));
        System.out.println("EthernetAdapter1 equals EthernetAdapter2: " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("EthernetAdapter1 equals EthernetAdapter3: " + ethernetAdapter1.equals(ethernetAdapter3));

        System.out.println("Monitor1 hashCode: " + monitor1.hashCode());
        System.out.println("Monitor2 hashCode: " + monitor2.hashCode());
        System.out.println("Monitor3 hashCode: " + monitor3.hashCode());

        System.out.println("EthernetAdapter1 hashCode: " + ethernetAdapter1.hashCode());
        System.out.println("EthernetAdapter2 hashCode: " + ethernetAdapter2.hashCode());
        System.out.println("EthernetAdapter3 hashCode: " + ethernetAdapter3.hashCode());
    }
}
