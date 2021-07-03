package io.github.janbarari.designpattern.pipeline

class PrintResultStage : Stage<List<Car>, String> {

    override fun process(input: List<Car>): String {
        val result = input.toString()
        println("\n\nMap cars model to one line:")
        println(result)
        return result
    }

}