package HW9;

//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
//У третій масив внесіть результат додавання перших двох.

public class Task5 {
    public static void main(String[] args) {
        int [][] array1 = {
                {3, 5, 7},
                {1, 0, 7},
                {12, 5, 4}
        };

        int [][] array2 = {
                {4, 1, 7},
                {1, 8, 7},
                {3, 5, 3}
        };

        int[][] array3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
