fun main() {
    fun part1(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        input.map {
            val split = it.split(" ", limit = 2)
            Pair(split[0], split[1].toInt())
        }.forEach {
            val (direction, x) = it
            when (direction) {
                "forward" -> horizontal += x
                "down" -> depth += x
                "up" -> depth -= x
            }
        }
        return horizontal * depth
    }

    fun part2(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0
        input.map {
            val split = it.split(" ", limit = 2)
            Pair(split[0], split[1].toInt())
        }.forEach {
            val (direction, x) = it
            when (direction) {
                "forward" -> {
                    horizontal += x
                    depth += x * aim
                }
                "down" -> aim += x
                "up" -> aim -= x
            }
        }
        return horizontal * depth
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
