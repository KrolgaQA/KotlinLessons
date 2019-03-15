package com.kotlin.coreConstructions

fun main(args: Array<String>) {
    factorial(4)
    factorial(5)
    factorial(6)
}

fun factorial(n: Int) {
    var result = 1
    for (d in 1..n) {
        result *= d
    }
    println("Factorial of $n is equal to $result")
}