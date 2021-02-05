package artik.by;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog_3_4 {
    public Prog_3_4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] arr = new int[n];
        Random random=new Random(24);
        for(int i=0; i<n;i++){
            arr[i]=random.nextInt(50);
        }

        boolean sorted = false;
        while (!sorted){
            sorted= true;
            for(int i=1; i<n;i++){
                if(arr[i-1]>arr[i]){
                    sorted = false;
                    arr[i-1]=arr[i-1]^arr[i];
                    arr[i]=arr[i-1]^arr[i];
                    arr[i-1]=arr[i-1]^arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
