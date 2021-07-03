package io.github.janbarari.designpattern.pipeline
interface Stage<I, O> {
    fun process(input: I): O
}

