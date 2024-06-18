import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    var str = s.next()

    val c_alpha = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    for(alpha in c_alpha){
        if(str.contains(alpha)){
            str = str.replace(alpha,"*")
        }
    }
    print(str.length)
}