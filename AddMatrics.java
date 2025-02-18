import java.util.Scanner;
public class AddMatrics {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows = scan.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scan.nextInt();
            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];
            int[][] res = new int[rows][cols];
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("matrix1[" + i + "][" + j + "]: ");
                    matrix1[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("matrix2[" + i + "][" + j + "]: ");
                    matrix2[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    res[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Resultant matrix after addition:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }