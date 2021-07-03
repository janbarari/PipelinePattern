package io.github.janbarari.designpattern.pipeline

class Pipeline<I, O> {

    val currentStage: Stage<I, O>

    constructor(firstStage: Stage<I, O>) {
        this.currentStage = firstStage
    }

    fun <K> addStage(newStage: Stage<O, K>): Pipeline<I, K> {
        return Pipeline(
            object : Stage<I, K> {
                override fun process(input: I): K {
                    return newStage.process(currentStage.process(input))
                }
            }
        )
    }

    fun execute(input: I): O {
        return currentStage.process(input)
    }

}