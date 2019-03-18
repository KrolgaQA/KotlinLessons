package com.kotlin.classes

class Employee(name: String, val company: String) : OpenPersonClass(name){
    override fun display() {
        println("Name: $name Company: $company")
    }
}