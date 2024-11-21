package OOP_HW9.task1;

public class MyList <T>{
    private Object[] elements;
    private int size;

    public MyList(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    public MyList(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    public void add(T element){
        if(size>= elements.length){
            System.out.println("list is full");
            return;
        }
        elements[size++] = element;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i] + " ");
        }
        System.out.println();
    }


}
