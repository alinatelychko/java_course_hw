package HW9;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {4,35,28,14};


        int[] reversedNumbers = myReverse(array);
        System.out.println("Обернена послідовність:");

        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i] +" ");
        }

        System.out.println();

        int[] subArrayResult = subArray(array, 3, 5);
        System.out.println("Результат:");

        for (int i = 0; i < subArrayResult.length; i++) {
            System.out.print(subArrayResult[i] +" ");
        }


    }
public static int[] myReverse(int [] array){
        int[] reversedArray = new int[array.length];
        int j = 0;

    for (int i = array.length -1; i >=0 ; i--) {
        reversedArray[j]=array[i];
        j++;
    }
    return reversedArray;

}

  public static int [] subArray (int [] array, int index, int count){
int[] sub = new int [count];

      for (int i = 0; i < count ; i++) {
          if (index + i < array.length){
              sub[i] = array[index+i];
          }else {
              sub[i]=1;
          }
      }
      return sub;
  }

}
