fun main() {
    fun part1(input: List<String>): Int {
        var previous: Int? = null
        var increased = 0
        for (line in input) {
            val newValue = line.toInt()
            if (previous != null && newValue > previous) {
               increased++
            }
            previous = newValue
        }
        return increased
    }

    fun part2(input: List<String>): Int {
        val max = input.size - 3
        var previous: Int? = null
        val measurements = input.map { it.toInt() }
        var increased = 0
        for (i in 0..max) {
           val newValue = measurements[i] + measurements[i + 1] + measurements[i + 2]
            if (previous != null && newValue > previous!!) {
                increased++
            }
            previous = newValue
        }

        return increased
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
