import java.util.Scanner

data class Point(val x: Int, val y: Int)

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val city = Array(n){IntArray(n)}
    val house = mutableListOf<Point>()
    val chick = mutableListOf<Point>()

    for(i in 0 until n){
        for(j in 0 until n){
            city[i][j] = sc.nextInt()
            when(city[i][j]){
                1 -> house.add(Point(i, j))
                2 -> chick.add(Point(i, j))
            }
        }
    }

    var minDis = Int.MAX_VALUE

    // 백트래킹 함수: start부터 시작해 select 리스트에 치킨집을 추가하며 탐색
    fun dfs(start : Int, select: List<Point>){
        if(select.size == m){
            // 선택된 m개의 치킨집에 대해 도시의 치킨 거리 계산
            val dist = house.sumOf{ house ->
                select.minOf{chick -> Math.abs(house.x - chick.x) + Math.abs(house.y - chick.y)}
            }
            minDis = minOf(minDis, dist) // 최소 치킨 거리 갱신
            return  
        }
        for(i in start until chick.size){
            dfs(i + 1, select + chick[i])
        }
    }
    dfs(0, emptyList())
    println(minDis)
}
