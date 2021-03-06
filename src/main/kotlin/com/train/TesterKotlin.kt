package com.train

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var num="0"
    while(num.toInt()!=-1) {
        print("Please enter number of tickets:  ")
        num = scanner.next()
        if(num.toInt()==-1){break}
        print("How many round-trip tickets:  ")
        val doubleNum = scanner.next()
        val tickerKotlin = TickerKotlin(num.toInt(), doubleNum.toInt())
        println("Total tickets:\t$num\n" +
                "Round-trip:\t$doubleNum\n" +
                "Total:\t${tickerKotlin.getTotal()}\n")
    }
}

class TickerKotlin(var num: Int, var doubleNum: Int) {
    val fare = 1000
    fun doubleFare(): Int {
        return (fare * 2 * 0.9).toInt()
    }
    fun getTotal(): Int {
        return (num - doubleNum) * fare + doubleNum * doubleFare()
    }

}