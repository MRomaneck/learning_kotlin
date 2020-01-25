fun main () {
    println(getMax(a = 11, b = 5, c = 7))
}

fun getMax(a:Int, b:Int) = if (a > b) a else b

fun getMax(a:Double, b:Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int) =
    when {
        a >= b && a >=c -> a
        b >= a && b >=c -> b
        else -> c
    }
