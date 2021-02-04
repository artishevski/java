package artik.by;

import java.util.Scanner;

public class Prog_2_4 {
    public Prog_2_4() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        scanner.close();
        if(n%2==1){
            throw new Error("n must be an even number");
        }

        int[][] matrix = new int[n][n];

        for(int j=0;j<n;j++){
            for(int i=0;i<n;i+=2){
                matrix[i][j]=j+1;
                matrix[i+1][n-j-1]=j+1;
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
