package com.kotlin.coreConstructions

//fun main(args: Array<String>) {
//    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    numbers[2] = 7
//    val n = numbers[2]
//    print(n)
//
//}

import java.util.*

fun main(args: Array<String>) {
    val numbers = Array(3, {5})
    println(numbers[1]) // Для вывода одного значения массива используем переменную с указанием номера элемента (нумерация начинается с 0)
    println(Arrays.toString(numbers)) // Для вывода всех значений массива используется класс Arrays с методом toString()
}

