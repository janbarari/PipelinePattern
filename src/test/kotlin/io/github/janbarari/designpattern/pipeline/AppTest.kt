package io.github.janbarari.designpattern.pipeline


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

/**
 * App Test
 */
class AppTest {

    @Test
    fun shouldExecuteAppWithoutException() {
        assertDoesNotThrow {
            App.main(arrayOf())
        }
    }

}