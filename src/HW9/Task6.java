package HW9;

public class Task6 {
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

        int[][] array3 = addMatrices(array1, array2);

        System.out.println("Результат: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " \t");
            }
            System.out.println();
        }
    }



        public static int[][] addMatrices (int[][] matrix1, int[][] matrix2){
            int [][] result  = new int[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }
}
