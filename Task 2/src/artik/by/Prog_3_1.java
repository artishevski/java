package artik.by;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog_3_1 {
    int getK(Scanner scanner, int length) {
        int k = scanner.nextInt();
        try {
            if (k > length) {
                throw new Exception("k is bigger than array length!");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Enter new k: ");
            getK(scanner, length);
        }
        return k;
    }

    public Prog_3_1() {
        Random random = new Random(24);

        int[] first = new int[10];
        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(50);
        }

        int[] second = new int[12];
        for (int i = 0; i < second.length; i++) {
            second[i] = random.nextInt(50);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = getK(scanner, first.length);
        scanner.close();
        int res[] = new int[first.length + second.length];
        System.arraycopy(first, 0, res, 0, k);
        System.arraycopy(second, 0, res, k, second.length);
        System.arraycopy(first, k, res, k + second.length, first.length - k);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(res));
    }
}
