package io.github.janbarari.designpattern.pipeline

object App {

    @JvmStatic
    fun main(args: Array<String>) {

        val cars = arrayListOf<Car>(
            Car("red", "benz", "s500"),
            Car("red", "benz", "s500"),
            Car("red", "bmw", "730i"),
            Car("green", "audi", "s7"),
            Car("red", "kia", "sportage")
        )

        Pipeline(FilterRedColorStage())
            .addStage(DistinctByModelStage())
            .addStage(MapCarsResultStage())
            .also {
                it.execute(cars)
            }
    }

}