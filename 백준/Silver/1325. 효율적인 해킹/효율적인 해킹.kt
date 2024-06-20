import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val graph = Array(n + 1) { mutableListOf<Int>() }

    for (i in 1..m) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        graph[b].add(a)
    }

    val countArr = IntArray(n + 1)
    var max = 0

    for (i in 1..n) {
        val check = BooleanArray(n + 1)
        val q: Queue<Int> = LinkedList()
        q.add(i)
        check[i] = true
        var count = 0

        while (q.isNotEmpty()) {
            val now = q.poll()
            for (next in graph[now]) {
                if (!check[next]) {
                    check[next] = true
                    q.add(next)
                    count++
                }
            }
        }
        countArr[i] = count
        max = maxOf(max, count)
    }

    for (i in 1..n) {
        if (countArr[i] == max) {
            bw.write("$i ")
        }
    }
    bw.flush()
    bw.close()
}
