package io.github.janbarari.designpattern.pipeline

class FilterRedColorStage : Stage<List<Car>, List<Car>> {

    override fun process(input: List<Car>): List<Car> {
        val result = input.filter { it.color == "red" }
        println("\n\nFilter red cars:")
        println(result.toString())
        return result
    }

}