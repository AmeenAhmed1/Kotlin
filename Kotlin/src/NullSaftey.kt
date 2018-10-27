/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args:Array<String>){

    var name:String? //That means name can be null

    name = null //Assign null to [Var name]
    println(name) //will print null

    name = "Ameen" //you can re-assign
    println(name) //will print [Ameen]



    //We can try to make it null again and see
    //try to print it again
    name = null
    /*
    this exclamation mark means that
    if this value = null stop the program
    and will through an exception [KotlinNullPointerException]
     */
    print(name!!)

}
