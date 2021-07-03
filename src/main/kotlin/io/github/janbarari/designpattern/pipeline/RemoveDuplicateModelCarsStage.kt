package io.github.janbarari.designpattern.pipeline

class RemoveDuplicateModelCarsStage : Stage<List<Car>, List<Car>> {

    override fun process(input: List<Car>): List<Car> {
        val result = input.distinctBy { it.model }
        println("\n\nRemove duplicate cars:")
        println(result.toString())
        return result
    }

}