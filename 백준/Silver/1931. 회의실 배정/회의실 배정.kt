import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()!!.toInt()
    val list = Array(n) { IntArray(2) }
    for (i in 0 until n) {
        val input = br.readLine()!!.split(" ")
        list[i][0] = input[0].toInt() // 시작 시간
        list[i][1] = input[1].toInt() // 종료 시간
    }
    // 종료 시간을 기준으로 정렬하고, 종료 시간이 같으면 시작 시간으로 정렬
    list.sortWith(compareBy({ it[1] }, { it[0] }))

    var count = 0
    var endTime = 0

    for (i in 0 until n) {
        if (list[i][0] >= endTime) {
            endTime = list[i][1]
            count++
        }
    }

    println(count)
}
