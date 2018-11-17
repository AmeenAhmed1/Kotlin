/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

//Open means you can inherit from me
open class Car{

    private var type:String?= null
    private var price:Double?= null

    constructor(type:String, price:Double){
        this.type = type
        this.price = price
    }

    constructor(){
        this.type = "KIA"
        this.price = 1684.456
    }

    fun getType(): String? {
        return this.type
    }

    fun getPrice() : Double? {
        return this.price
    }

    //We will override this fun in the child class
    //With different implementation
    open fun calculatorRate(rate:Double){
        println("Parent Rate = ${rate*15}")
    }
}

//This class inherits from the parent Car class all the
//Methods if it is public
class SmallCar(): Car(){

    override fun calculatorRate(rate:Double){
        super.calculatorRate(rate) //will call the parent implementation
        println("Child Rate ${rate*20}")
    }
}


fun main(args: Array<String>) {

    var mCar = Car("BMW", 1526.15)
    println(mCar.getType())
    println(mCar.getPrice())

    var mCar2 = Car()
    println(mCar2.getType())
    println(mCar2.getPrice())

    var mSmallCar = SmallCar()
    println(mSmallCar.getType())
    println(mSmallCar.getPrice())




    //inheritance
    var mCarRateChild = SmallCar()
    val mCarRateParent = Car()

    mCarRateParent.calculatorRate(20.5)
    mCarRateChild.calculatorRate(20.5)

}