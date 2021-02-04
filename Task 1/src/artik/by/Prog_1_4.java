package artik.by;

import java.util.Scanner;

public class Prog_1_4 {
    public Prog_1_4() {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.next());
        scanner.close();
        boolean isPositive = true;
        if (num < 0) {
            isPositive = false;
            num *= -1;
        }
        int a = (int) num;
        int b = (int) (num * 1000 - a * 1000);
        num = b + (double) a / 1000;
        if (!isPositive) {
            num *= -1;
        }
        System.out.println(num);
    }
}
