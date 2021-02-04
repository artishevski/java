package artik.by;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prog_1_5 {
    public Prog_1_5(){
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.next());
        scanner.close();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        System.out.print(decimalFormat.format(time/3600) + "h ");
        System.out.print(decimalFormat.format(time%3600/60) + "m ");
        System.out.println(decimalFormat.format(time%3600%60) + "s");
    }
}
