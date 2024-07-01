package BaekJoon.Greedy

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        var n = scanner.nextInt()
        if (n == 0) break

        if (n > 0) {
            val bags = mutableListOf<Int>()
            repeat(n) {
                bags.add(scanner.nextInt())
            }
            bags.sort()

            var pairs = 1
            var pair = 1
            for (i in 1 until bags.size) {
                if (bags[i] == bags[i - 1]) {
                    pair++
                } else {
                    pair = 1
                }
                pairs = maxOf(pair, pairs)
            }
            println(pairs)
            for (i in 0 until pairs) {
                print(bags[i])
                var j = i + pairs
                while (j < n) {
                    print(" ${bags[j]}")
                    j += pairs
                }
                println()
            }
        }
    }
}
