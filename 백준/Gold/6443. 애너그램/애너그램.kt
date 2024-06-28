import java.util.*


fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    sc.nextLine()
    val sb = StringBuilder()
    for(i in 0 until n){
        result = ArrayList()
        alpha = IntArray(26)
        words = sc.nextLine().toCharArray()
        for(c in words){
            var index = c - 'a'
            alpha[index]++
        }
        dfs(0, StringBuilder())
        for(s in result){
            sb.append(s).append("\n")
        }
    }
    println(sb)
}

lateinit var words: CharArray
lateinit var result: MutableList<String>
var alpha = IntArray(26)

fun dfs(depth: Int, sb:StringBuilder){
    if(depth == words.size){
        result.add(sb.toString())
        return
    }
    for(i in 0..25){
        if(alpha[i] != 0){
            val index = (i + 'a'.code).toChar()
            alpha[i]--
            sb.append(index)
            dfs(depth+1, sb)
            sb.deleteCharAt(sb.length-1)
            alpha[i]++
        }
    }
}