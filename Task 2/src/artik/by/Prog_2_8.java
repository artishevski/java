package artik.by;

import java.util.Random;
import java.util.Scanner;

public class Prog_2_8 {
    public Prog_2_8() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random(24);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        showArray(matrix);
        System.out.println("Enter columns numbers: ");
        int col1 = scanner.nextInt() + 1;
        int col2 = scanner.nextInt() + 1;
        scanner.close();
        for(int i=0;i<n;i++){
            matrix[i][col1]=matrix[i][col1]^matrix[i][col2];
            matrix[i][col2]=matrix[i][col1]^matrix[i][col2];
            matrix[i][col1]=matrix[i][col1]^matrix[i][col2];
        }
        showArray(matrix);
    }

    void showArray(int[][] arr) {
        for (int[] line : arr) {
            for (int el : line) {
                System.out.print(el + "\t\t");
            }
            System.out.println();
        }
    }
}
