package artik.by;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Prog_2_7 {
    public Prog_2_7() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        scanner.close();

        double[][] matrix = new double[n][n];

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=Math.sin(((double)(i*i)-j*j)/n);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#####");

        for(double[]line:matrix){
            for(double el:line){
                System.out.print(decimalFormat.format(el)+"\t\t");
            }
            System.out.println();
        }
    }
}
