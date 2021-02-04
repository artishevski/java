package artik.by;

import java.util.Scanner;

public class Prog_2_5 {
    public Prog_2_5() {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.next());
        scanner.close();
        System.out.println(f(x));
    }

    double f(double x) {
        if (x > 3) {
            return 1 / (x * x * x + 6);
        } else {
            return x * x - 3 * x + 9;
        }
    }
}
