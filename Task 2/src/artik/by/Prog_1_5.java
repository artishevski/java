package artik.by;

import java.util.Scanner;

public class Prog_1_5 {
    public Prog_1_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array numbers: ");
        String[]input=scanner.nextLine().split("\\s+");
        scanner.close();
        int[] numbers=new int[input.length];
        int i=0;
        for(String str:input){
            numbers[i++]=Integer.parseInt(str);
        }

        for(int j=0;j<numbers.length;j++){
            if(numbers[j]>j+1){
                System.out.print(numbers[j]+" ");
            }
        }
    }
}
