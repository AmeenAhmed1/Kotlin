/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {


    getNumber(5) //will print 10

    makeSum(10,4) //will print 14

    var returnValue = returnSum(10, 5) //will return 15
    println("Return value = $returnValue")
}


fun getNumber(number: Int?){
    println(number!!) //if num is null throw an exception
    println("You passed a number = ${number}" )
}


fun makeSum(num1: Int , num2: Int){
    println("Sum = ${num1+num2}")
}


fun returnSum(num1:Int, num2:Int) : Int{
    return num1+num2
}
