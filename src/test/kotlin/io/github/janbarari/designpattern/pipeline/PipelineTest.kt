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
            Car("red", "benz", "s500", 10_000),
            Car("red", "benz", "s500", 10_000),
            Car("red", "bmw", "730i", 12_000),
            Car("green", "audi", "s7", 44_000),
            Car("red", "kia", "sportage", 5_000)
        )

        val pipeline = Pipeline(KeepOnlyRedCarsStage())
            .addStage(RemoveDuplicateModelCarsStage())
            .addStage(IncreaseBenzCarsPriceStage())
            .addStage(PrintResultStage())

        assertEquals(
            "[Car(color=red, brand=benz, model=s500, price=11000), Car(color=red, brand=bmw, model=730i, price=12000), Car(color=red, brand=kia, model=sportage, price=5000)]",
            pipeline.execute(cars)
        )

    }

}