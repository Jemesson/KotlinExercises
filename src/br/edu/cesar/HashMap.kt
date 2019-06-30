package br.edu.cesar

fun main() {
    val names = listOf("jim", "jem", "ethan", "fabio")
    val map = hashMapOf<Int, String>()

    for (i in 0..3) {
        map.put(i, names[i])
    }

    for ((key, value) in map) {
        println("key $key value $value")
    }
}
