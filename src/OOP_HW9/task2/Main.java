package OOP_HW9.task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();

        myDictionary.add(2,"A");
        myDictionary.add(3,"B");
        myDictionary.add(4,"C");

        System.out.println(myDictionary);

        for (int i = 0; i < myDictionary.getVar2().size(); i++) {
            String value = myDictionary.getVar2().get(i);
            Integer key = myDictionary.getKey(value);

            System.out.println("Key: " + key + ", Value: " + value);

        }


    }
}
