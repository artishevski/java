package artik.by;

import java.util.Scanner;

public class Prog_2_4 {
    public Prog_2_4() {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int z = Integer.parseInt(scanner.next());
        scanner.close();
        int min1 = x, min2 = y;
        if (x > y) {
            if (y > z) {
                min1 = z;
            } else {
                min1 = y;
                if (x > z) {
                    min2 = z;
                } else {
                    min2 = x;
                }
            }
        } else {
            if (x > z) {
                min1 = z;
                min2 = x;
            } else {
                if (y > z) {
                    min2 = z;
                }
            }
        }
        if (A > B) {
            A = A ^ B;
            B = A ^ B;
            A = A ^ B;
        }
        if (min1 > A || min2 > B) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }


}
