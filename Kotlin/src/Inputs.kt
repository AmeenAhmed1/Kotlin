/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args:Array<String>){

    // readLine() function always returns Strings

    var name = readLine()
    println(name)

    val lastName:String? = readLine()
    println(lastName!!) //if this null stop

    var midName:String = readLine()!! //we use this to make sure the name can not accept null
    println(midName)

    var age = readLine()!!.toInt() //To convert readLine to read integer
    println(age)

    var average:Double = readLine()!!.toDouble()
    println(average)
    
}
