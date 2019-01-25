package com.train;

public class Ticker {
    private int fare = 1000;
    private int num;
    private int doubleNum;

    public Ticker(String num, String doubleNum) {
        this.num = Integer.parseInt(num);
        this.doubleNum = Integer.parseInt(doubleNum);
    }

    private int doubleFare() {//來回的票價
        return (int) (fare * 2 * 0.9);
    }

    public int getTotal() {
        return (num - doubleNum) * fare + doubleNum * doubleFare();
    }

}
