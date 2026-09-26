package _01_Abstractions._4_Traffic_Lights;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Signal[] signal = Arrays.stream(scan.nextLine().split("\\s+"))
                        .map(Signal::valueOf).toArray(Signal[]::new);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {

         Signal.updateSignal(signal);
         Signal.printSignals(signal);


        }





    }


}
