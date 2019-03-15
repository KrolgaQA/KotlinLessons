package com.kotlin.coreConstructions

fun main(args: Array<String>) {
    displaySomeInformation("телевизор", "Черный", 100, "Samsung")
    displaySomeInformation(name = "утюг", size = 50, company = "Bosh", color = "Белый")
}

fun displaySomeInformation(name: String, color: String, size: Int, company: String) {
    println("$color $name $company, размер $size*$size")
}