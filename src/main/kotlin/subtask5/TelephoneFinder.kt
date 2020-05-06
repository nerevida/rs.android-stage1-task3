package subtask5


class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.isNotEmpty() and number.matches(Regex("\\d+"))) {
            var ar: Array<String> = emptyArray()
            number.forEachIndexed { index, it ->
                val neighbors: List<Char> =
                    when (it) {
                        '0' -> arrayListOf('8')
                        '1' -> arrayListOf('2', '4')
                        '2' -> arrayListOf('1', '3', '5')
                        '3' -> arrayListOf('2', '6')
                        '4' -> arrayListOf('1', '5', '7')
                        '5' -> arrayListOf('2', '4', '6', '8')
                        '6' -> arrayListOf('3', '5', '9')
                        '7' -> arrayListOf('4', '8')
                        '8' -> arrayListOf('5', '7', '9', '0')
                        '9' -> arrayListOf('6', '8')
                        else -> arrayListOf()
                    }
                neighbors.forEach {
                    val newPhone = number.replaceRange(index..index, it.toString())
                    ar = ar.plusElement(newPhone)
                }
            }
            return ar
        } else {
            return null
        }
    }
}
