/*
 * Copyright (c) 2018
 * Created by [ Ameen-Essa ]
 */

fun main(args: Array<String>) {

    var thread1 = TestThread("T1")
    thread1.start()

    var thread2 = TestThread("T2")
    thread2.start()
    thread2.join() //Won`t continue after thread2 finish

    println("Threads")

}


class TestThread : Thread{

    var prosses:String ?= null
    constructor(prosses:String): super() {
        this.prosses = prosses
    }

    override fun run() {

        for (i in 1..5) {
            println("$prosses = $i")
            Thread.sleep(1000)
        }
    }
}

