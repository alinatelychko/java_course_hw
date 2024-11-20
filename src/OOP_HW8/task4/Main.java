package OOP_HW8.task4;

public class Main implements Interface {
    public static void main(String[] args) {
        Animal[] animals = {new Animal("Dog", 2, true),
                new Animal("Cat",4, true),
        new Animal("Vaska", 45, false)};

        Main main = new Main();

        main.output(animals);
    }

    @Override
    public void output(Animal[] alimals) {
        for (int i = 0; i < alimals.length; i++) {

            System.out.println(alimals[i]);
        }
    }
}
