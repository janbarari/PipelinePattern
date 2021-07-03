package io.github.janbarari.designpattern.pipeline

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 * Test for {@link Pipeline}
 */
class PipelineTest {

    @Test
    fun testPipeline() {

        val strFilterPipeline = Pipeline(RemoveAlphabetsStage())
            .addStage(RemoveDigitsStage())
            .addStage(ConvertToCharArrayStage())

        assertArrayEquals(
            charArrayOf('!'),
            strFilterPipeline.execute("a3!")
        )

    }

}