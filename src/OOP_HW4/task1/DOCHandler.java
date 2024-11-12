package OOP_HW4.task1;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Відкриття DOC документу...");
    }

    @Override
    public void create() {
        System.out.println("Створення DOC документу...");
    }

    @Override
    public void change() {
        System.out.println("Редагування DOC документу...");
    }

    @Override
    public void save() {
        System.out.println("Збереження DOC документу...");
    }
}

