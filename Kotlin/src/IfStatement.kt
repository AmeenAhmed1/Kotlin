/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    /*
        Here we will make a simple application to try the if statement
        if the grade of student is greater than or equal 50 then he will pass
        otherwise he will fail.
     */

    print("Enter your course grade : ")

    var mGrade:Float = readLine()!!.toFloat() //Here we get the grade from the user

    if(mGrade >= 50)
        println("Pass")
    else if(mGrade <= 50)
        println("Fail")
    else
        println("Other wise")

}