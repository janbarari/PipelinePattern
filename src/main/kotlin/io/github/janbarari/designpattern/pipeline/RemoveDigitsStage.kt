package io.github.janbarari.designpattern.pipeline

class RemoveDigitsStage : Stage<String, String> {

    override fun process(input: String): String {
        val inputWithoutDigits = StringBuilder()
        input.chars()
            .filter {
                !Character.isDigit(it)
            }
            .mapToObj { it.toChar() }
            .forEachOrdered(inputWithoutDigits::append)

        val inputWithoutDigitsStr = inputWithoutDigits.toString()

        println(
            String.format(
                "Current handler: %s, input is %s of type %s, output is %s, of type %s",
                RemoveDigitsStage::class.java,
                input,
                String::class.java,
                inputWithoutDigitsStr,
                String::class.java
            )
        )

        return inputWithoutDigitsStr
    }

}