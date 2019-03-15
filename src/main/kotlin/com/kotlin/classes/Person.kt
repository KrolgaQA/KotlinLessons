package com.kotlin.classes

fun main(args: Array<String>) {
    val tom: Person = Person()
    val bob: Person = Person()
    val alice: Person = Person()

    println(bob.name)
    println(bob.age)
    bob.name = "Bob"
    bob.age = 25
    println(bob.name)
    println(bob.age)
}
class Person {
    var name: String = "Tom"
    var age: Int = 18
}
