/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    for(item in 1..5){ //you can change item to anything you want
        print("$item ") //it will prints numbers from 1 to 5
    }

    println() //Print new line

    //Another one
    var number = 15
    while (number >= 10){ //Here will check and then execute
        println("Number is greater than 10") //it will printed 6 times

        number--; //increase the number by 1 [Number - 1]
    }

    println() //Print new line

    var number2 = 15
    do{ //Here will execute then check

        println("Number is greater than 10") //it will printed 6 times too
        number2--

    }while (number2 >= 10)


    /*
        We can use Loop control like Break and Continue
        Using labels
     */

    //Here when i became 3 it will break only the nasted loop
    for(i in 1..20){

        for(y in 1..3){
            if(i == 3)

                break
        }
    }


    //Here when i became 3 it will break only the all loops in the label
    label@ for(i in 1..20){
        
        for(y in 1..3){
            if(i == 3)

                break@label
        }
    }


}