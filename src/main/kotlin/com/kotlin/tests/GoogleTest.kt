package com.kotlin.tests

import com.codeborne.selenide.CollectionCondition.size
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selenide.*
import org.junit.Test
import org.openqa.selenium.By

class GoogleTest {
    @Test
    fun user_can_search_everything_in_google() {
        open("http://google.com/ncr")
        `$`(By.name("q")).setValue("selenide").pressEnter()

        `$$`("#ires .g").shouldHave(size(7))

        `$`("#ires .g").shouldBe(visible).shouldHave(
            text("Selenide: concise UI tests in Java"),
            text("selenide.org"))
    }
}
