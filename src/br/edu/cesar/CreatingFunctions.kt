package br.edu.cesar

fun printSum(x: Int, y: Int): Int {
    return x + y
}

fun printFruitsStartingByLetter(fruits: List<String>, letter: String) {
    fruits.filter { it.startsWith(letter) }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}

fun main() {
    val items = listOf(1, 2, 3, 4, 5)
    val fruits = listOf("apple", "acerola", "banana", "kiwifruit")
    var sum = 0

    for (item in items) {
        sum = printSum(sum, item)
    }

    println("Sum of $items is $sum")

    printFruitsStartingByLetter(fruits, "a")
}