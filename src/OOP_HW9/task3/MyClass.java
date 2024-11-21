package OOP_HW9.task3;

public class MyClass <T>{

    private T field;

    public MyClass(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public static<T> MyClass<T> factoryMethod(T value){

        return new MyClass<>(value);

    }

    @Override
    public String toString() {
        return "MyClass{" +
                "field=" + field +
                '}';
    }
}
