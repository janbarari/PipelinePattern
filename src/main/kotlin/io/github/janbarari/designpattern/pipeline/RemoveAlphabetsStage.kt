package io.github.janbarari.designpattern.pipeline

class RemoveAlphabetsStage : Stage<String, String> {

    override fun process(input: String): String {
        val inputWithoutAlphabets = StringBuilder()
        input.chars()
            .filter {
                !Character.isAlphabetic(it)
            }
            .mapToObj { it.toChar() }
            .forEachOrdered(inputWithoutAlphabets::append)

        val inputWithoutAlphabetsStr = inputWithoutAlphabets.toString()

        println(
            String.format(
                "Current handler: %s, input is %s of type %s, output is %s, of type %s",
                RemoveAlphabetsStage::class.java,
                input,
                String::class.simpleName,
                inputWithoutAlphabetsStr,
                String::class.simpleName
            )
        )
        return inputWithoutAlphabetsStr
    }

}