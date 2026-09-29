package _2_Encapsulation._1_Class_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        Box box = new Box (length, width, height);

        System.out.printf("Surface Area - %.2f\n", box.surfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n", box.lateralSurface());
        System.out.printf("Volume - %.2f\n", box.volume());


    }
}
