import java.io.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var t = br.readLine().toInt()

    for(i in 1..t){
        val (a:Int, b:Int) = br.readLine().split(" ")
            .map {it.toInt()}
        bw.write("${a+b}\n")
    }
    bw.flush()
    bw.close()
}