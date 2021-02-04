package artik.by;

import java.util.Scanner;

public class Prog_3_7 {
    public Prog_3_7(){
        Scanner scanner = new Scanner(System.in);
        int m=Integer.parseInt(scanner.next());
        int n=Integer.parseInt(scanner.next());
        scanner.close();
        for(int i=m;i<=n;i++){
            System.out.print(i +": ");
            for(int j=2; j<i/2+1;j++){
                if(i%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
