package io.github.janbarari.designpattern.pipeline

class MapCarsResultStage : Stage<List<Car>, String> {

    override fun process(input: List<Car>): String {
        val result = input.map { it.model }.toString()
        println("\n\nMap cars model to one line:")
        println(result)
        return result
    }

}