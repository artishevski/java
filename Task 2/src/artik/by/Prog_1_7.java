package artik.by;

import java.util.Scanner;

public class Prog_1_7 {
    public Prog_1_7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array numbers: ");
        String[] input = scanner.nextLine().split("\\s+");
        scanner.close();
        double[] numbers = new double[input.length];
        int arrSize = 0;
        for (String str : input) {
            numbers[arrSize++] = Double.parseDouble(str);
        }
        if (arrSize % 2 == 1) {
            throw new Error("Aray's length must be even");
        }

        int j = 0;
        double max = numbers[j] + numbers[arrSize - 1 - j++];
        while (j < arrSize - j) {
            if (numbers[j] + numbers[arrSize - 1 - j] > max) {
                max = numbers[j] + numbers[arrSize - 1 - j];
            }
            j++;
        }

        System.out.println(max);
    }
}
