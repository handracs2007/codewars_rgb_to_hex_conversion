// https://www.codewars.com/kata/513e08acc600c94f01000001/train/kotlin

fun rgb(r: Int, g: Int, b: Int): String {
    val hexR = r.coerceIn(0..255).toString(16).padStart(2, '0')
    val hexG = g.coerceIn(0..255).toString(16).padStart(2, '0')
    val hexB = b.coerceIn(0..255).toString(16).padStart(2, '0')

    return "$hexR$hexG$hexB".toUpperCase()
}

fun main() {
    println(rgb(0, 0, 0))
    println(rgb(300, 255, 255))
}