import java.util.*

fun main(){
    val s = Scanner(System.`in`)

    var a = s.nextInt()

    if(a%4==0){
        if(a%400==0&&a%100==0){
            print(1)
        }
        else if(a%100==0){
            println(0)
        }
        else print(1)
    } else print(0)
}