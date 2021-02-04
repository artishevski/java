package artik.by;

import java.util.Random;
import java.util.Scanner;

public class Prog_2_13 {
    public Prog_2_13() {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        Random random=new Random(24);
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=random.nextInt(50);
            }
        }
        showMatrix(matrix);
        sortByIncrease(matrix);
        showMatrix(matrix);
        sortByDecrease(matrix);
        showMatrix(matrix);
    }

    void sortByIncrease(int[][] matrix){
        for(int j=0;j<matrix[0].length;j++){
            for(int k=0;k<matrix.length;k++){
                for(int i=1;i<matrix.length;i++){
                    if(matrix[i-1][j]>matrix[i][j]){
                        int temp = matrix[i-1][j];
                        matrix[i-1][j]=matrix[i][j];
                        matrix[i][j]=temp;
                    }
                }
            }
        }
    }

    void sortByDecrease(int[][] matrix){
        for(int j=0;j<matrix[0].length;j++){
            for(int k=0;k<matrix.length;k++){
                for(int i=1;i<matrix.length;i++){
                    if(matrix[i-1][j]<matrix[i][j]){
                        int temp = matrix[i-1][j];
                        matrix[i-1][j]=matrix[i][j];
                        matrix[i][j]=temp;
                    }
                }
            }
        }
    }

    void showMatrix(int[][] arr) {
        System.out.println();
        for (int[] line : arr) {
            for (int el : line) {
                System.out.print(el + "\t\t");
            }
            System.out.println();
        }
    }
}
