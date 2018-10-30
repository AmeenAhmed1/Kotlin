/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    /*
        Here we will play with strings
        and its functions
     */

    var mMessage = "  Hello, user" //it has length 13

    println(mMessage.length) //will print 10 because index starts with 0 to 1

    for(index in 0 .. (mMessage.length - 1) )
        print("$index = ${mMessage[index]} ") //will print every index alone

    println()

    //Strings main functions we will use
    println(mMessage.toLowerCase()) //will make all string to lower case
    println(mMessage.toUpperCase()) //will make all string to upper case

    println(mMessage.trim()) //will remove all spaces in the start

    println(mMessage.split(" ")) //will split the string when found a space you can change it
}
