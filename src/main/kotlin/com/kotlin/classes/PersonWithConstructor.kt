package com.kotlin.classes

fun main(args: Array<String>) {
    val tom: PersonWithConstructor = PersonWithConstructor("Tom")
    val bob: PersonWithConstructor = PersonWithConstructor("Bob", 21)

    println("Name: ${tom.name} Age: ${tom.age}")
    println("Name: ${bob.name} Age: ${bob.age}")
}

class PersonWithConstructor(_name: String) {
    val name: String
    var age: Int = 0

    init {
        name = _name
    }

    constructor(_name: String, _age: Int) : this(_name) {
        age = _age
    }
}