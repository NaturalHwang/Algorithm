import java.io.BufferedReader
import java.io.InputStreamReader

fun maxScore(list: Array<IntArray>): Int {
    val n = list[0].size

    val dp = Array(3) { IntArray(2) }
    dp[0][0] = 0
    dp[1][0] = list[0][0]
    dp[2][0] = list[1][0]

    for (i in 1 until n) {
        dp[0][i % 2] = maxOf(dp[0][(i - 1) % 2], dp[1][(i - 1) % 2], dp[2][(i - 1) % 2])
        dp[1][i % 2] = maxOf(dp[0][(i - 1) % 2], dp[2][(i - 1) % 2]) + list[0][i]
        dp[2][i % 2] = maxOf(dp[0][(i - 1) % 2], dp[1][(i - 1) % 2]) + list[1][i]
    }

    return maxOf(dp[0][(n - 1) % 2], dp[1][(n - 1) % 2], dp[2][(n - 1) % 2])
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine()!!.toInt()

    repeat(T) {
        val n = br.readLine()!!.toInt()
        val list = Array(2) {
            br.readLine()!!.split(" ").map { 
                it.toIntOrNull() ?: throw NumberFormatException("Invalid number format in input")
            }.toIntArray()
        }
        println(maxScore(list))
    }
}
