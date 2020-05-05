package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (i in 1..n) {
            val result = (factorial(n) / (factorial(i) * (factorial(n - i)))).toInt()
            if (m == result) return i
        }
        return null
    }

    private fun factorial(num: Int): Long {
        return if (num == 0) {
            1
        } else {
            (2..num).fold(1, Long::times)
        }
    }
}
