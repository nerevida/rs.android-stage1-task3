package subtask3

import kotlin.math.absoluteValue

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {

        val intArray = itemsFromArray
            .filterIsInstance<Int>()

        return if (intArray.isNotEmpty()) {
            maxOf(
                intArray.sortedByDescending { it }
                    .take(numberOfItems)
                    .fold(1) { i, other -> i.times(other) },
                intArray.sortedByDescending { it.absoluteValue }
                    .take(numberOfItems)
                    .fold(1) { i, other -> i.times(other) }
            )
        } else {
            0
        }
    }
}
