package com.kotlin.coreConstructions

//когда n будет равно 5, сработает оператор continue,
// и последующая инструкция, которая выводит на консоль квадрат числа,
// не будет выполняться
//fun main(args: Array<String>) {
//    for(n in 1..8){
//        if(n == 5) continue
//        println(n * n)
//    }
//}

//когда n окажется равен 5, то с помощью оператора break будет выполнен выход из цикла
fun main(args: Array<String>) {
    for(n in 1..5){
        if(n == 5) break
        println(n * n)
    }
}
