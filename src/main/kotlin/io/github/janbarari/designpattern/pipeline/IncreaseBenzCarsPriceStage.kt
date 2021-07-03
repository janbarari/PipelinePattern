package io.github.janbarari.designpattern.pipeline

class IncreaseBenzCarsPriceStage: Stage<List<Car>, List<Car>> {

    override fun process(input: List<Car>): List<Car> {
        val result: List<Car> = input.map {
            if (it.brand == "benz") {
                it.price = it.price + ((it.price * 10) / 100)
            }
            return@map it
        }
        println("\n\nIncrease benz cars price by 10%")
        println(result.toString())
        return result
    }

}