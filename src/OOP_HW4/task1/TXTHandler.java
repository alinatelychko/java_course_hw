package OOP_HW4.task1;

public class TXTHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Відкриття TXT документу...");
    }

    @Override
    public void create() {
        System.out.println("Створення TXT документу...");
    }

    @Override
    public void change() {
        System.out.println("Редагування TXT документу...");
    }

    @Override
    public void save() {
        System.out.println("Збереження TXT документу...");
    }
}
