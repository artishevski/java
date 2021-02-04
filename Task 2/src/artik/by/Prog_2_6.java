package artik.by;

import java.util.Scanner;

public class Prog_2_6 {
    public Prog_2_6() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        scanner.close();
        if(n%2==1){
            throw new Error("n must be an even number");
        }

        int[][] matrix = new int[n][n];

        for(int i=0;i<n/2;i++){
            for (int j=i;j<n-i;j++){
                matrix[i][j]=1;
            }
        }

        for(int i=n/2;i<n;i++){
            for (int j=n-i-1;j<i+1;j++){
                matrix[i][j]=1;
            }
        }

        for(int[]line:matrix){
            for(int el:line){
                System.out.print(el+"\t\t");
            }
            System.out.println();
        }

    }
}
