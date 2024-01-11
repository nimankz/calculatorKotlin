package org.example

import java.util.*
import kotlin.collections.HashMap

open class person() {
    var name:String?=null
    var age:Int?=null
    var gender:String?=null

}

class calculator():person(){

    var num1: Int=0
    var num2: Int=0

//    val listOfHistory= mutableListOf(HashMap<String,Any>())
    var listOfHistory= arrayOfNulls<HashMap<String,Any>>(0)
    fun addHistory(operation:String,name:String?,opNumber:Int){
        val history = HashMap<String,Any>()
        history.put("no. of action",opNumber.toString())
        history.put("name",name.toString())
        history.put("operation",operation)
//        listOfHistory.add(history)
        listOfHistory+=history

    }
    fun sum(): Int{addHistory("sum",name,listOfHistory.size-1);return num1 + num2}
    fun sub(): Int{addHistory("sub",name,listOfHistory.size-1);return num1-num2}
    fun mult(): Int{addHistory("mult",name,listOfHistory.size-1);return num1*num2}
    fun dive(): Int{addHistory("div",name,listOfHistory.size-1);return num1/num2}

}
fun main() {
//    var num1:Int?=null //these are our input numbers.
//    var num2:Int?=null

    val aronCalc = calculator()
    aronCalc.name="Aron"
    aronCalc.num1=12
    aronCalc.num2=8
    println(Arrays.toString(aronCalc.listOfHistory))
    println(aronCalc.sum())
    aronCalc.num1=15
    println(aronCalc.sum())
    println(aronCalc.sub())
    aronCalc.num2=2
    println(aronCalc.mult())
    println(Arrays.toString(aronCalc.listOfHistory))



//    println("num1 = ${calc.num1}, num2 = ${calc.num2}")
//    println("sum is: ${calc.sum()}")
//    println("div is: ${calc.div()}")
//    println("mult is: ${calc.mult()}")
//    println("sub is: ${calc.sub()}")


}
