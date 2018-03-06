import java.util.*

fun getHighestPopulationYear(yearMap: Map<Int, Int>): Int {
    val births = yearMap.keys
    val deaths = yearMap.values
    val timelineMap = mutableMapOf<Int,Int>()
    births.map { timelineMap.put(it, 1) }
    deaths.map { timelineMap.put(it, -1) }
    val sortedTimelineMap = timelineMap.toSortedMap()
    var currentAlive = 0
    var maxAlive = 0
    var highestYear = -1
    sortedTimelineMap.forEach {
        println("Highest year: $highestYear Highest pop: $maxAlive")
        println("Start of year: $it Pop: $currentAlive")
        currentAlive += it.value
        println("End of year: $it Pop: $currentAlive")
        if (currentAlive > maxAlive) {
            maxAlive = currentAlive
            highestYear = it.key
        }
    }
    return highestYear
}


val mapOfYears = mapOf(
        2000 to 2010,
        1975 to 2005,
        1975 to 2003,
        1803 to 1809,
        1750 to 1869,
        1840 to 1935,
        1803 to 1921,
        1894 to 1921
)

fun main(args: Array<String>) {
    val sum = getHighestPopulationYear(mapOfYears)
    println(sum)
}
