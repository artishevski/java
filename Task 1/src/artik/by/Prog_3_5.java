package artik.by;

import java.util.Scanner;

public class Prog_3_5 {
    public Prog_3_5() {
        Scanner scanner = new Scanner(System.in);
        double e = Double.parseDouble(scanner.next());
        scanner.close();
        double sum = 0.0;
        int n = 1;
        double curr = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        while (curr >= e) {
            sum += curr;
            curr = 1 / Math.pow(2, ++n) + 1 / Math.pow(3, n);
        }
        System.out.println(sum);
    }
}
