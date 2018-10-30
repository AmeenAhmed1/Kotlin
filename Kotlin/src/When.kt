/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {


    var number:Int = readLine()!!.toInt()

    when(number){

        1 -> println("Num is 1")
        2 -> println("Num is 2")

        5,6 -> println("Num is 5 or 6") //Num is 5 or 6

        in 3..20 -> println("Num between 3 and 20") //The number between 3 and 20 including them

        !in 3..20 -> println("Not between 3 and 20") //The number not between 3 and 20 including them

        else -> println("Num is not in range")

    }

}