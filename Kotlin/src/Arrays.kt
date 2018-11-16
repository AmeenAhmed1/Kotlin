/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */
fun main(args: Array<String>) {

    var array = Array<Int>(5) {0} //will make an array with 5 elements include values of zero

    for(item in array)
        println(item) //Will print every element in the array

    for(index in 0..array.size-1)
        println(array[index]) // will print every element in the array




    //Array List [Dynamic array]
    var arrayList = ArrayList<String>()
    arrayList.add("A")
    arrayList.add("B")
    arrayList.add("C")

    for (item in arrayList)
        println(item)


}
