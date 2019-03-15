package com.kotlin.coreConstructions

fun square(x: Int): Int {
    var result = x * x
    return result
}
fun main(args: Array<String>) {
    val a = square (5)  // 25
    val b = square (6)  // 36
    println("a=$a  b=$b")
}
