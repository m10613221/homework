package com.mailBox.kotlin

import java.util.TreeSet

fun main(args: Array<String>) {
    print("\nPlease enter object's length: ")
    val length = readLine()!!.toFloat()
    print("Please enter object's width: ")
    val width = readLine()!!.toFloat()
    print("Please enter object's height: ")
    val height = readLine()!!.toInt()

    when {
        Box3MailBox().validate(length,width,height) -> print("Box3")
        Box5MailBox().validate(length,width,height) -> print("Box5")
        else -> println("No box fix.")
    }
    /*//上下列程式相同，因為判斷依據皆為boolean，可以改為when取代switch case
    if (Box3MailBox().validate(length,width,height)){
        print("Box3")
    }else if (Box5MailBox().validate(length,width,height)){
        print("Box5")
    }else{
        println("No box fix.")
    }*/
}

class Box3MailBox() : MailBox(23f,14f,13)
class Box5MailBox() : MailBox(39.5f,27.5f,23)


open class MailBox(var length :Float,var width :Float,var height :Int) {
    //回傳此箱是否適合物品大小
    fun validate(length: Float, width: Float, height: Int): Boolean {
        val mailBox=queue(this.length,this.width,this.height)
        val userBox=queue(length,width,height)

        val result = (0 until mailBox.size).none { mailBox[it]<userBox[it] }
        /*//上下列程式功能相同
        var result =true
        for (i in 0 until mailBox.size){
            if (mailBox[i]<userBox[i]){
                result=false
            }
        }*/
        return result
    }

    //排序長、寬、高的數值，以(float)回傳
    fun queue(length: Float, width: Float, height: Int): FloatArray {
        val result = FloatArray(3)
        val treeSet = TreeSet<Float>()
        treeSet.add(length)
        treeSet.add(width)
        treeSet.add(height.toFloat())
        var i=0
        treeSet.forEach{
            result[i]=it
            i++
        }
        return result
    }
}
