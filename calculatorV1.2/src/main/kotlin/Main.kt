package org.example

class calculator(var num1: Int, var num2: Int){
    fun sum(): Int{return num1 + num2}
    fun sub(): Int{return num1-num2}
    fun mult(): Int{return num1*num2}
    fun div(): Int{return num1/num2}
}
fun main() {
    var num1:Int?=null //these are our input numbers.
    var num2:Int?=null
    num1= 12
    num2= 8
    val calc = calculator(num1,num2)
    println("num1 = ${calc.num1}, num2 = ${calc.num2}")
    println("sum is: ${calc.sum()}")
    println("div is: ${calc.div()}")
    println("mult is: ${calc.mult()}")
    println("sub is: ${calc.sub()}")

}
