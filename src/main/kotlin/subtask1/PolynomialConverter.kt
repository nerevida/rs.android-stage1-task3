package subtask1

import kotlin.math.abs

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isNotEmpty())
            return numbers.foldIndexed("") { index, result, item ->
                val st =
                    when (index) {
                        numbers.lastIndex -> ""
                        numbers.lastIndex - 1 -> "x"
                        else -> "x^${numbers.lastIndex - index}"
                    }
                val sign =
                    when {
                        item < 0 -> " - "
                        (item > 0) and (index != 0) -> " + "
                        else -> ""
                    }
                when (item) {
                    0 -> result
                    1, -1 -> "${result}${sign}${st}"
                    else -> "$result${sign}${abs(item)}${st}"
                }
            }.trim()
        else return null
    }
}
