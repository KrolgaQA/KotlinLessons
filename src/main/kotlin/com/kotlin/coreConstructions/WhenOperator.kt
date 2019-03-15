package com.kotlin.coreConstructions

//fun main(args: Array<String>) {
//    val sum = 1000
//    val rate = when(sum){
//        in 100..999 -> 10
//        in 1000..9999 -> 15
//        else -> 20
//    }
//    println(rate)       // 15
//}

//fun main(args: Array<String>) {
//    val a = 10
//    when(a){
//        in 10..19 -> println("a в диапазоне от 10 до 19")
//        in 20..29 -> println("a в диапазоне от 20 до 29")
//        !in 10..20 -> println("a вне диапазона от 10 до 20")
//        else -> println("неопределенное значение")
//    }
//}

fun main(args: Array<String>) {
    val a = 10
    when(a){
        10, 20 -> println("a = 10 или a = 20")
        else -> println("неопределенное значение")
    }
}

