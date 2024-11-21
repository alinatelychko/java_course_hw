package OOP_HW9.task2;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary <Element1, Element2> {
    private List<Element1> var1;
    private List<Element2> var2;

    public MyDictionary(List<Element1> var1, List<Element2> var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public MyDictionary(){
        var1 =new ArrayList<>();
        var2 = new ArrayList<>();

    }

    public List<Element1> getVar1() {
        return var1;
    }

    public void setVar1(List<Element1> var1) {
        this.var1 = var1;
    }

    public List<Element2> getVar2() {
        return var2;
    }

    public void setVar2(List<Element2> var2) {
        this.var2 = var2;
    }

    public void add (Element1 num, Element2 str){
        var1.add(num);
        var2.add(str);

    }

    public Element1 getKey(Element2 value){
        int index = var2.indexOf(value);

        if(index>=0){
            return var1.get(index);
        }else {
            return null;
        }

    }

    @Override
    public String toString() {
        return "MyDictionary{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }


}
