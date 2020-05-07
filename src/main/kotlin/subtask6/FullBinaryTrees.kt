package subtask6

class FullBinaryTrees {


    fun stringForNodeCount(count: Int): String {
        return if ((count > 0) and (!count.isEven())) {
            var trees = ArrayList<BiTree>()
            for (i in 1..count step 2) {
                var oneMoreTree = BiTree(null)

                // todo implement

                trees.add(oneMoreTree)
            }
            return trees.toString()
        } else
            "[]"
    }

    class BiTree(private var child: BiTree?) {
        private val value: String = "0"

        override fun toString(): String {
            return if (child == null) "[${value}]" else "[${value},${child.toString()},${child.toString()}]"
        }
    }
}

private fun Int.isEven(): Boolean {
    return this % 2 == 0
}


