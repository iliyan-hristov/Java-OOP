package _04_Interfaces_and_Abstraction_Exercise._2_Telephony;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split("\\s+");
        List<String> numbersToPrint = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].matches("\\d+")) {
                numbersToPrint.add(numbers[i]);
            } else {
                System.out.println("Invalid number!");
            }
        }


        String[] urls = scan.nextLine().split("\\s+");
        List<String> urlsToPrint = new LinkedList<>();
        for (int i = 0; i < urls.length; i++) {
            if (urls[i].matches(".*\\d.*")) {
                System.out.println("Invalid URL!");
            } else {
                urlsToPrint.add(urls[i]);
            }
        }


        for (String number : numbersToPrint) {
            System.out.println("Calling... " + number);
        }


        for (String url : urlsToPrint) {
            System.out.println("Browsing: " + url);
        }


    }
}
