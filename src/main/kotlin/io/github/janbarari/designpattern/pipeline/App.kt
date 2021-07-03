package io.github.janbarari.designpattern.pipeline

object App {

    @JvmStatic
    fun main(args: Array<String>) {

        val cars = arrayListOf<Car>(
            Car("red", "benz", "s500", 10_000),
            Car("red", "benz", "s500", 10_000),
            Car("red", "bmw", "730i", 12_000),
            Car("green", "audi", "s7", 44_000),
            Car("red", "kia", "sportage", 5_000)
        )

        Pipeline(KeepOnlyRedCarsStage())
            .addStage(RemoveDuplicateModelCarsStage())
            .addStage(IncreaseBenzCarsPriceStage())
            .addStage(PrintResultStage())
            .also {
                it.execute(cars)
            }
    }

}