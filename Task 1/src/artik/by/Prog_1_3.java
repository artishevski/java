package artik.by;

import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Prog_1_3 {
    public Prog_1_3(){
        double x, y;
        Scanner scanner = new Scanner(System.in);
        x = Double.parseDouble(scanner.next());
        y = Double.parseDouble(scanner.next());
        scanner.close();
        System.out.println((sin(x) +cos(y))/(cos(x)-sin(y))*tan(x*y));
    }
}
