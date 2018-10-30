/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    var intString:String = "12" //this is a string we need to convert it to Int
    var int:Int = intString.toInt() //Now we convert it to Int
    println(int) //will print 12

    var doubleString:String = "12.5"
    var double:Double = doubleString.toDouble()
    println(double) //will print 12.5

    var floatString:String = "12.42"
    var float:Float = floatString.toFloat()
    println(float) //will print 12.42

    //Also we can get the round of an double or float like this
    var roundDouble:Int = double.toInt()
    println(roundDouble) //will print 12

    var roundFloat:Int = float.toInt()
    println(roundFloat) //will print 12

    //Also we can convert from any data type to string
    var convertToString:String = float.toString()
    println(convertToString) //will print 12.42

}
