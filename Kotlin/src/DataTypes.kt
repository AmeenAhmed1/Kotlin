/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */


fun main(args: Array<String>) {


    val name = "Ameen"; //it an constant value can`t be changed
    println("Value = $name")
    //name = "Ahmed" //Can`t be re-assigned

    var lastName = "Essa" //we can change it later as we can
    /*
    You can type it like that also
    var lastName:String = "Essa"
     */
    println("Variable lastName = $lastName") //Will print [Essa]

    lastName = "Ahmed" //give a new value to lastName
    println("Variable lastName = $lastName") //will print [Ahmed]


    var x:Double = 2.5
    var y:Float = 2.1f
    var z:Int = 5
}