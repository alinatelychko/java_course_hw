package HW9;

public class CustomerArray {
    public static void main(String[] args) {
        int[] array = new int[4];

        array[0]=13;
        array[1]=30;
        array[2]=28;
        array[3]=45;

        System.out.println("Мінімальне значення набору = "+ minValue(array));
        System.out.println("Максимальне значення набору = "+ maxValue(array));
        System.out.println("Сумарне значення набору = "+ sumArray(array));
        System.out.println("Середнє значення набору = "+ averageValue(array));
        oddNum(array);
    }

    static int maxValue(int[] array){
int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int minValue(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    static int sumArray(int[] array){
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
           sum+=array[i];
        }
        return sum;
    }

    static double averageValue(int[] array){
double average = (double) sumArray(array) /array.length;
        return average;
    }

    static void oddNum(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 !=0){
                System.out.println(array[i] +" - число непарне");
            }
        }
    }

}
