package org.example

class calculator(num1: Int, num2: Int){
    fun sum(num1: Int, num2: Int): Int{return num1 + num2}
    fun sub(num1: Int, num2: Int): Int{return num1-num2}
    fun mult(num1: Int, num2: Int): Int{return num1*num2}
    fun div(num1: Int, num2: Int): Int{return num1/num2}
}
fun main() {
    var num1:Int?=null //these are our input numbers.
    var num2:Int?=null
    num1= 12
    num2= 8
    val calc = calculator(num1,num2)
    println("num1 = ${num1}, num2 = ${num2}")
    println("sum is: ${calc.sum(num1,num2)}")
    println("div is: ${calc.div(num1,num2)}")
    println("mult is: ${calc.mult(num1,num2)}")
    println("sub is: ${calc.sub(num1,num2)}")

}