import java.util.Scanner

fun main(){
    var answer = 0
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    val arr = IntArray(n)
    for(i in 0..n-1){
        arr[i] = s.nextInt()
    }
    val v = s.nextInt()

    for(i in 0..n-1){
        if(arr[i] == v) answer++
    }
    print(answer)
}