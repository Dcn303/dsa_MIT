package _05_2D_Matrix;

public class _01_Print_Diagonal {
    public static void main(String[] args) {
        int[][] mat = {
                        {3, 8, 9},
                        {1, 2, 3},
                        {4, 10, 11}
                      };

        System.out.println("Printing Diagonal of the matrix");
        System.out.println("Printing left to right");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i == j)
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing right to left");
        for (int i = 0, j = mat[0].length-1; i < mat.length && j >= 0; i++, j--){
            System.out.println(mat[i][j]);
        }
    }
}
