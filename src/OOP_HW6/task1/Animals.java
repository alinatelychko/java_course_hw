package OOP_HW6.task1;

public enum Animals {
    LION(8),
    TIGER(5),
    ELEPHANT(25),
    MONKEY(10);


    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                '}';
    }
}
