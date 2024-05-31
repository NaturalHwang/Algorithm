import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    // 배열 내 같은 수가 존재하는 경우가 있기 때문에 입력과 동시에 정렬시킴
    val list = br.readLine().split(" ").map { it.toInt() }.sorted()

    var count = 0

    for (k in 0 until n) {
        val good = list[k]
        var i = 0
        var j = n - 1

        while (i < j) {
            // 배열이 0 0 0일 경우
            // 계속해서 i = 0, j = 2인 경우의 수만 반환하기에 조건식 추가
            if (i == k) {
                i++
                continue
            }
            if (j == k) {
                j--
                continue
            }

            val sum = list[i] + list[j]

            when {
                sum == good -> {
                    count++
                    break // unique한 경우의 수이므로 while문 나가고 k++
                }
                sum < good -> i++
                else -> j--
            }
        }
    }

    println(count)
}
