package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("This application will give you PI to the Nth decimal\nUp to 15 decimal places!");
        System.out.println("------------------------------------");

        while (true)  {
            System.out.println();
            System.out.print("Please provide a number: ");
            String digits = scanner.nextLine();
            int number;

            try {
                number = Integer.parseInt(digits);
            } catch (NumberFormatException n) {
                System.out.println("Must be a valid number");
                continue;
            }

            if (number > 0 && number < 16) {
                String pi = findPiDigits(number);
                System.out.println("PI to the " + number + "th digit is: " + pi);
                break;
            } else {
                System.out.println("Must be a number 15 or under");
            }
        }

    }

    public static String findPiDigits(int number) {
        double pi = Math.PI;
        String piString = "" + pi;


        return piString.substring(0, number + 2);
    }
}
