package OOP_HW5.task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Mr. Smith");
        teachers.add("Ms. Johnson");
        teachers.add("Mr. Brown");
        teachers.add("Ms. Davis");
        teachers.add("Mr. Wilson");
        System.out.println(teachers);

        System.out.println("Кращий - " + teachers.indexOf("Ms. Johnson"));
        System.out.println("гірший - " + teachers.indexOf("Mr. Wilson"));
    }
}