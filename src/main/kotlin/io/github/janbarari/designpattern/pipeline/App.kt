package io.github.janbarari.designpattern.pipeline

object App {

    @JvmStatic
    fun main(args: Array<String>) {
        Pipeline(RemoveAlphabetsStage())
            .addStage(RemoveDigitsStage())
            .addStage(ConvertToCharArrayStage())
            .also {
                it.execute("GoYankees123!%$")
            }
    }

}