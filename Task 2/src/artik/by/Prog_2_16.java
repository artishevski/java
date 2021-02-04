//only for odd numbers
package artik.by;

import java.util.Scanner;

public class Prog_2_16 {
    int scan() {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        try {
            if (val % 2 == 0) {
                throw new EvenNumberException();
            }
        } catch (EvenNumberException ex) {
            System.out.println(ex);
            scan();
        }
        scanner.close();
        return val;
    }

    public Prog_2_16() {
        int n = scan();
        int size = n + n - 1;
        int[][] matrix = new int[size][size];

        int counter = 1;
        for (int i = n - 1; i < size; i++) {
            for (int j = i - n + 1, k = i; j < i + 1; j++, k--) {
                matrix[k][j] = counter++;
            }
        }

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            for (int k = 0; k < i + 1; k++) {
                matrix[i + n][j + 2 * k] = matrix[i][j + 2 * k];
                matrix[i][j + 2 * k] = 0;
            }
        }

        for (int i = size-1, j = n - 1; i > size - n/2-1; i--, j--) {
            for (int k = 0; k < size - i; k++) {
                matrix[i - n][j + 2 * k] = matrix[i][j + 2 * k];
                matrix[i][j + 2 * k] = 0;
            }
        }

        for (int j = 0, i = n - 1; j < n / 2; j++, i--) {
            for (int k = 0; k < j + 1; k++) {
                matrix[i + 2*k][j + n] = matrix[i+2*k][j];
                matrix[i+2*k][j] = 0;
            }
        }

        for (int j = size-1, i = n - 1; j > size - n/2-1; j--, i--) {
            for (int k = 0; k < size - j; k++) {
                matrix[i +2*k][j -n] = matrix[i+2*k][j];
                matrix[i+2*k][j] = 0;
            }
        }

        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            System.arraycopy(matrix[i+n/2],n/2,res[i],0,n);
        }


        showMatrix(res);
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

class EvenNumberException extends Exception {
    public EvenNumberException() {
        super("Number must be odd");
    }
}