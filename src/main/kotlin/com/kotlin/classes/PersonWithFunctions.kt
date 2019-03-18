package com.kotlin.classes

fun main(args: Array<String>) {
    val bob: PersonWithFunctions = PersonWithFunctions("Bob", 23)
    bob.sayHello()// Hello
    bob.go("the shop")// Bob goes to the shop
    bob.go("the cinema")// Bob goes to the cinema
    println(bob.getInfo())// Name: Bob  Age: 23
}

class PersonWithFunctions(val name: String, val age: Int){
    fun sayHello(){
        println("Hello")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun getInfo(): String{
        return "Name: $name Age: $age"
    }
}
