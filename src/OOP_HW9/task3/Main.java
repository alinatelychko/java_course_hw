package OOP_HW9.task3;

import OOP_HW8.task4.Interface;

public class Main {
    public static void main(String[] args) {
        MyClass<String> someString = new MyClass<>("some");
        System.out.println(someString);

        MyClass<Integer> someInt = new MyClass<>(1);
        System.out.println(someInt);

    }
}
