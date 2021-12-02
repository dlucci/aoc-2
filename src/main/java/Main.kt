import java.io.File

fun main(args : Array<String>) {
    var horizontal = 0
    var depth = 0
    File("~/IdeaProjects/aoc-2/src/main/resources/data.txt").forEachLine {
        val split = it.split(" ")
        when(split[0]) {
            "forward" -> {
                horizontal+=split[1].toInt()
            }

            "up" -> {
                depth-=split[1].toInt()
            }

            "down" -> {
                depth+=split[1].toInt()
            }
        }
    }

    println(depth * horizontal)
}