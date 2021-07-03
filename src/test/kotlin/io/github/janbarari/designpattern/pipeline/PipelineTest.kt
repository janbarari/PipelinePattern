package io.github.janbarari.designpattern.pipeline

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Test for {@link Pipeline}
 */
class PipelineTest {

    @Test
    fun testPipeline() {

        val cars = arrayListOf<Car>(
            Car("red", "benz", "s500"),
            Car("red", "benz", "cls500"),
            Car("red", "bmw", "730i"),
            Car("green", "audi", "s7"),
            Car("red", "benz", "s200")
        )

        val pipeline = Pipeline(FilterRedColorStage())
            .addStage(DistinctByModelStage())
            .addStage(MapCarsResultStage())

        assertEquals(
            "[s500, 730i]",
            pipeline.execute(cars)
        )

    }

}