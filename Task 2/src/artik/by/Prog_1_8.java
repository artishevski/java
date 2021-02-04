package artik.by;

import java.util.Arrays;
import java.util.Scanner;

public class Prog_1_8 {
    public Prog_1_8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array numbers: ");
        String[] input = scanner.nextLine().split("\\s+");
        scanner.close();
        double[] numbers = new double[input.length];
        int arrSize = 0;
        for (String str : input) {
            numbers[arrSize++] = Double.parseDouble(str);
        }
        double min=  numbers[0];
        int minAmount=0;
        for(double n : numbers){
            if(n<min){
                min=n;
                minAmount=0;
            }
            if(n==min){
                minAmount++;
            }
        }
        double[] res = new double[arrSize - minAmount];
        int i=0;
        for(double num:numbers){
            if (num!=min){
                res[i++]=num;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
