import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, M, R) = br.readLine().split(" ").map { it.toInt() }

    val adjList = Array(N + 1) { mutableListOf<Int>() }
    repeat(M) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        adjList[u].add(v)
        adjList[v].add(u)
    }
    for (i in 1..N) {
        adjList[i].sort()
    }

    val visited = BooleanArray(N + 1)
    val order = IntArray(N + 1)
    var count = 1

    fun dfs(node: Int) {
        visited[node] = true
        order[node] = count++
        for (neighbor in adjList[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor)
            }
        }
    }

    dfs(R)

    val sb = StringBuilder()
    for (i in 1..N) {
        sb.append(order[i]).append("\n")
    }
    print(sb)
}
