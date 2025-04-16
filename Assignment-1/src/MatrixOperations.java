import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                B[i][j] = sc.nextInt();

        System.out.println("\nAddition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((A[i][j] + B[i][j]) + " ");
            System.out.println();
        }

        System.out.println("\nSubtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((A[i][j] - B[i][j]) + " ");
            System.out.println();
        }

        System.out.println("\nMultiplication:");
        if (cols != rows) {
            System.out.println("Matrix multiplication not possible (columns of A must equal rows of B)");
        } else {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
