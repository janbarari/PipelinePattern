package io.github.janbarari.designpattern.pipeline

import java.util.*

class ConvertToCharArrayStage : Stage<String, CharArray> {

    override fun process(input: String): CharArray {
        val characters = input.toCharArray()
        val string = characters.contentToString()

        println(
            String.format(
                "Current handler: %s, input is %s of type %s, output is %s, of type %s",
                ConvertToCharArrayStage::class.java,
                input,
                String::class.java,
                string,
                Array<Char>::class.java
            )
        )

        return characters
    }

}