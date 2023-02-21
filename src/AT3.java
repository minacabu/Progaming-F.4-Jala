import java.util.Scanner;

public class AT3 {
    public static int[][] matrix = new int[3][3];
    public static int Determining(int matrix[][]){
        int n = matrix.length;
        int det = 1;
        for (int i = 0; i < n; i++) {
            int count = i;
            while (count < n && matrix[count][i] == 0) {
                count++;
            }
            if (count == n) {
                return 0;
            } else if (count != i) {
                int[] tmp = matrix[i];
                matrix[i] = matrix[count];
                matrix[count] = tmp;
                det = -det;
            }
            for (int j = i + 1; j < n; j++) {
                int factor = matrix[j][i] / matrix[i][i];
                for (int k = i + 1; k < n; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
                matrix[j][i] = 0;
            }
            det *= matrix[i][i];
        }
        return det;
    }
    public static int Symmetric(int matrix[][]){
        int n = matrix.length;;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    System.out.println("\nYour matrix is  Symmetric");
                    return 0;
                                    }
            }
        }
        System.out.println("\nYour matrix not is Symmetric");

        return 1;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("insert the value to colum [" + i + "] line [" + j + "] ");
                matrix[i][j] = read.nextInt();
            }
        }
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                System.out.print("["+matrix[i][j]+"]"+"\t");
            }System.out.println();
        } int det = Determining(matrix);
        System.out.println("\nYour Determining is :" + det+"\n");
        Symmetric(matrix);
    }
}
