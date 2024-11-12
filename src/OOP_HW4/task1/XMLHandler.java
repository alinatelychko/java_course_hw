package OOP_HW4.task1;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Відкриття XML документу...");
    }

    @Override
    public void create() {
        System.out.println("Створення XML документу...");
    }

    @Override
    public void change() {
        System.out.println("Редагування XML документу...");
    }

    @Override
    public void save() {
        System.out.println("Збереження XML документу...");
    }


}
