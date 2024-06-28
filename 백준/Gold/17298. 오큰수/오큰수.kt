import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var num = IntArray(n)
    var result = IntArray(n)
    val st = Stack<Int>()

    for(i in 0 until n){
        num[i] = sc.nextInt()
    }

    for(i in 0 until n){
        while(st.isNotEmpty() && num[st.peek()] < num[i]){
            result[st.pop()] = num[i]
        }
        st.push(i)
    }
    while(st.isNotEmpty()){
        result[st.pop()] = -1
    }
    val sb = StringBuilder()
    for(n in result){
        sb.append(n).append(" ")
    }
    println(sb)
}