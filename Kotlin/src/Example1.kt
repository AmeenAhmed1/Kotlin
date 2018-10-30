import java.util.*

/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    //A Quick example to use the calender function

    //Inputs
    var yearOfBirth:Int = readLine()!!.toInt() //Getting the user input

    //Process
    var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR) //Getting the current year from the computer date
    println("Current year = $currentYear")
    var age = currentYear - yearOfBirth //Calcualte the user age

    //Outputs
    println(age) //prints your year

}

