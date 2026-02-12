import java.util.*;
public class matrix_diagonal_swapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the matrix elements:");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //print the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
        swapDiagonals(matrix, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void swapDiagonals(int[][] matrix, int n, int m) {
        for (int i = 0; i < Math.min(n, m); i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][m - 1 - i];
            matrix[i][m - 1 - i] = temp;
        }
    }
}