package artik.by;

import java.util.Scanner;

public class Prog_1_1 {
    public Prog_1_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array numbers: ");
        String[] input = scanner.nextLine().split("\\s+");
        System.out.print("Enter K: ");
        final int K = Integer.parseInt(scanner.next());
        scanner.close();
        int[] numbers = new int[input.length];
        int i = 0;
        for (String str : input) {
            numbers[i++] = Integer.parseInt(str);
        }

        int sum = 0;
        for (int num : numbers) {
            if (num % K == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
