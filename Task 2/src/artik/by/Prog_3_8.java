package artik.by;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog_3_8 {
    public int greatestDivider(int num1, int num2) {
        int res = 1;
        int temp1 = num1;
        int temp2 = num2;
        if (Math.max(num1, num2) % Math.min(num1, num2) == 0) {
            res *= Math.min(num1, num2);
            temp1 /= Math.min(num1, num2);
            temp2 /= Math.min(num1, num2);
        }
        for (int i = 2; i < Math.min(num1, num2) / 2 + 1; i++) {
            while (temp1 % i == 0 && temp2 % i == 0) {
                res *= i;
                temp1 /= i;
                temp2 /= i;
            }
        }
        return res;
    }

    public int getCommonDenominator(RationalNumber[] arr) {
        int commonDenominator = 1;
        for (RationalNumber rationalNumber : arr) {
            commonDenominator *= rationalNumber.getQ() / greatestDivider(commonDenominator, rationalNumber.getQ());
        }
        return commonDenominator;
    }

    public void toCommonDenominator(RationalNumber[] arr, int commonDenominator) {
        for (RationalNumber rationalNumber : arr) {
            rationalNumber.setP(rationalNumber.getP() * commonDenominator / rationalNumber.getQ());
            rationalNumber.setQ(commonDenominator);
        }
    }

    public Prog_3_8() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        RationalNumber[] arr = new RationalNumber[n];
        Random random = new Random(24);
        for (int i = 0; i < n; i++) {
            arr[i] = new RationalNumber(random.nextInt(50), random.nextInt(4) + 1);
            arr[i].reduceFraction();
        }
        System.out.println(Arrays.toString(arr));
        toCommonDenominator(arr, getCommonDenominator(arr));
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sortArr(RationalNumber[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].getP() < arr[i - 1].getP()) {
                    sorted = false;
                    arr[i].setP(arr[i].getP() ^ arr[i - 1].getP());
                    arr[i - 1].setP(arr[i].getP() ^ arr[i - 1].getP());
                    arr[i].setP(arr[i].getP() ^ arr[i - 1].getP());
                }
            }
        }
    }
}

class RationalNumber {
    private int p;
    private int q;

    public void reduceFraction() {
        int min;
        for (int i = 2; i < Math.min(p, q) / 2 + 1; i++) {
            while (p % i == 0 && q % i == 0) {
                min = Math.min(p, q);
                p /= min;
                q /= min;
            }
        }
        if (Math.max(p, q) % Math.min(p, q) == 0) {
            min = Math.min(p, q);
            p /= min;
            q /= min;
        }
    }

    @Override
    public String toString() {
        return p + "/" + q;
    }

    public RationalNumber(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}