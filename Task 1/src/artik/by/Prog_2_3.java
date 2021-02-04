package artik.by;

import java.util.Scanner;

public class Prog_2_3 {
    public Prog_2_3(){
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.next());
        int y1 = Integer.parseInt(scanner.next());
        int x2 = Integer.parseInt(scanner.next());
        int y2 = Integer.parseInt(scanner.next());
        int x3 = Integer.parseInt(scanner.next());
        int y3 = Integer.parseInt(scanner.next());
        scanner.close();
        try {
            if((x3-x1)/(x2-x1)==(y3-y1)/(y2-y1)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        catch (ArithmeticException ex){
            System.out.println("false");
        }
    }
}
