package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num="0";
        while (Integer.parseInt(num)!=-1) {
            System.out.print("Please enter number of tickets: ");
            num = scanner.next();
            if(Integer.parseInt(num)==-1){break;}
            System.out.print("How many round-trip tickets:  ");
            String doubleNum = scanner.next();
            Ticker ticker = new Ticker(num, doubleNum);
            System.out.println("Total tickets:\t" + num +
                    "\nRound-trip:\t" + doubleNum +
                    "\nTotal:\t" + ticker.getTotal()+"\n");
        }
    }
}
