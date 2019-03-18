package com.kotlin.tests

import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.*
import java.lang.Math.sqrt
// Разрешение использовать короткое имя для функции
// Класс Tests, наличие класса обязательно для библиотеки JUnit
class Tests {

    // ...

    // Тестовая функция
    @Test
    fun testSqr() {
        assertEquals(4.0, sqrt(16.0))  // Проверить, что корень из 16 это 4
        assertEquals(4.0, sqrt(2.0))  // Проверить, является ли корень из 2 равным 4
        assertEquals(9.0, sqrt((-3.0))) // Проверить, является ли корень из "-3" равным девяти
        assertEquals(1.0,1.0)// Проверить равны ли единицы
    }
}
