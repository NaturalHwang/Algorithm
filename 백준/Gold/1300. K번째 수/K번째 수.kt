import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val K = br.readLine().toInt()

    var left: Long = 1
    var right: Long = K.toLong()
    var answer: Long = 0

    while (left <= right) {
        val mid = (left + right) / 2
        var count: Long = 0

        for (i in 1..N) {
            count += minOf(mid / i, N.toLong())
        }

        if (count < K) {
            left = mid + 1
        } else {
            answer = mid
            right = mid - 1
        }
    }

    println(answer)
}
