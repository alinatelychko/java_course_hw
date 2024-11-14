package OOP_HW7.task1;

public class Worker implements Comparable<Worker> {
    private String name;
    private String position;
    private int year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(Worker other) {
        // Порівнюємо працівників по алфавітному порядку за полем name
        return this.name.compareTo(other.name); // Використовуємо compareTo для рядків
    }
}
