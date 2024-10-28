package HW9;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] reversedNumbers = myReverse(array);
        System.out.println("Обернена послідовність:");

        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }

        System.out.println();
    }

    public static int[] myReverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i];
            j++;
        }
        return reversedArray;

    }
}