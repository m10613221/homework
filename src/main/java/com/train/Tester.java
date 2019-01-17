package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        String num = scanner.next();
        System.out.print("How many round-trip tickets:  ");
        String doubleNum = scanner.next();
        Ticker ticker = new Ticker(num, doubleNum);
        System.out.print("\nTotal tickets:\t" + num +
                "\nRound-trip:\t" + doubleNum +
                "\nTotal:\t" + ticker.getTotal());
    }
}
