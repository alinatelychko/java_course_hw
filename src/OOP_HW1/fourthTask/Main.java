package OOP_HW1.fourthTask;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();


        address.setIndex(10002);
        address.setCountry("Німеччина");
        address.setCity("Берлин");
        address.setStreet("Берлинер штрасе");
        address.setHouse(100);
        address.setApartment(1);

        System.out.println("Aдреса: " + address.getIndex() + ", "+ address.getCountry() +
                ", "+ address.getCity() + ", "+ address.getStreet() + ", "+ address.getHouse() + ", "
                + address.getApartment() + "; ");
    }
}
