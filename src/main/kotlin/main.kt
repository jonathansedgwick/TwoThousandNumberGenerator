import kotlin.random.Random

fun main() {
    var ranNum = 0
    var greaterNum = 0

    for (i in 1..2000) {
        ranNum = Random.nextInt(20, 45)
        if (ranNum > 38)
            greaterNum++
    }
    println("The random number was greater than 38 $greaterNum times")
}