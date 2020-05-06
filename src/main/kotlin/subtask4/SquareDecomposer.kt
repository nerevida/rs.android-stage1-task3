package subtask4

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {
        var s = getSqrts(number * number, number)
        return s

    }

    fun getSqrts(number: Int, q: Int): Array<Int>? {
//       if (number == 1) {
//           return arrayOf(1)
//       }
        loop@ for (i in q - 1 downTo 2) {
            val next = number - i * i
            val result =
                when {
                    next == 0 -> arrayOf(i)
                    next == 1 -> arrayOf(1).plus(i)
                    next > 0 -> getSqrts(next, i)?.plus(i)
                    else -> null
                }
            if (result != null) return result
        }
        return null
    }

}
