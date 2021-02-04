package artik.by;

import java.util.Scanner;

public class Prog_3_8 {
    public Prog_3_8() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        scanner.close();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] res = new char[Math.min(arr1.length, arr2.length)];

        int i = 0;

        for (char ch : arr1) {
            for (char ch2 : arr2) {
                if (ch == ch2) {
                    boolean isStillAbsent = true;
                    for (char ch3 : res) {
                        if (ch == ch3) {
                            isStillAbsent = false;
                            break;
                        }
                    }
                    if (isStillAbsent) {
                        res[i++] = ch;
                    }
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
