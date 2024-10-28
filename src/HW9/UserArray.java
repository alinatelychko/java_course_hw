package HW9;

import java.util.Arrays;

public class UserArray {
    public static void main(String[] args) {
int [] array = {23, 45, 67, 12, 34};
int addElement = 4;

int[] increasedArray = addElementMethod(array, addElement);
        System.out.println(Arrays.toString(increasedArray));

        int[] customArray = customMethod(array, addElement);
        System.out.println(Arrays.toString(customArray));


    }

    public static int[] addElementMethod (int[] array, int newElement){
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = newElement;

        return newArray;

    }

    public static int[] customMethod (int[] array, int value){
      int[] newArray1 = new int[array.length+1];
      newArray1[0] = value;

        for (int i = 0; i < array.length; i++) {
            newArray1[i+1]= array[i];
        }
return newArray1;
    }

}
