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

    alice.name = "Thomas"
    alice.age = -6
    print(alice.info)
}

class Person {
    var name: String = "Tom"
    var age: Int = 18
        set(value) {
            if ((value > 0) and (value < 110))
                field = value
        }

    val info: String
        get() = "Name: $name  Age: $age"


}
