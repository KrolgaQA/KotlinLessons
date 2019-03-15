package com.kotlin.test

fun main(args: Array<String>) {
    displayUser("Tom", 23)
    displayUser("Alice", 19)
    displayUser("Kate", 25)
}

fun displayUser(name: String, age: Int) {
    println("Name: $name   Age: $age")
}